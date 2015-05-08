
package proxy;

//prueba 
public class Proxy {


    public static void main(String[] args) {
		Ingeniero ing = new Ingeniero("Juan", "prueba.txt");
		Computologo comp = new Computologo("Toño", "prueba.java");
		Ingeniero ing2 = new Ingeniero("Raúl", "prueba.c");

		ing.guardaArchivo();
		comp.guardaArchivo();
		ing2.guardaArchivo();			        
    }
    
}
