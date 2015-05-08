package proxy;

public class Archivador{

	public boolean escribirArchivo(Estudiante est, String nombre){
		if((est instanceof Computologo) ){
			System.out.println("escribiendo fichero :)");
			return  true;
		}
		if(est instanceof Ingeniero){
			if(nombre.endsWith(".txt")){
				System.out.println("escribiendo fichero :)");
				return true;

			}else{
				System.out.println("no puedo, soy Ingeniero :(");
				return false;
			}
		}
		return true;
	}
}