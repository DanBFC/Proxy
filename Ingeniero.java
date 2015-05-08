package proxy;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Ingeniero extends Estudiante{
    public Archivador proxy;
    
    public Ingeniero(String nombre, String archivo){
        super(nombre, archivo);
        proxy = new Archivador();
    }
    
    public void guardaArchivo(){
        if(proxy.escribirArchivo(this, this.archivo)){
            try{
                BufferedWriter bw;
                File archivo = new File(super.archivo);
                if(!archivo.exists()){
                    bw = new BufferedWriter(new FileWriter(archivo));
                    bw.write(" ");
                    bw.close();
                }else{
                    System.out.println("No se creó el archivo: " + super.archivo);

                }
                
            }catch(Exception e){
                System.out.println("No se creó el archivo: " + super.archivo);                
            }
        }else{
            System.out.println("BBB Sólo puedes escribir .txt");
        }
    }
}