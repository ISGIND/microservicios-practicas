import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Una exception es un posible error en Java.
 * IOException error en las entradas y salidas de flujos de datos.
 * @author Dell5458
 *
 */
public class Exceptions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			metodo1();
		}catch(FileNotFoundException e) {
			System.err.println("Ocurrio un error intenta nuevamente"+ e.getMessage());
		}catch(LecturaArchivoException error) {
			System.out.println("Otro error");
		}
		finally{//codigo que se ejecuta finalmente se haya lanzado un error o no.
			System.out.println("Cerrando sesion ...");
		}
	}
	
	public static void metodo1() throws FileNotFoundException, LecturaArchivoException{
		//Hay dos tipos de excepciones	
		//Unchecked: Ocurren en tiempo de ejecución
		try {
			int var = 5/0;
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	
		System.out.println("Continua el programa...");
		
		
		//Checked: Se pueden validar en tiempo de compilacion, estoy obligado a atrapar la excepcion
		File archivo = new File("C:/temp/telefo.txt");//Esta apuntando a la direccion de memoria
		FileReader reader = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(reader);
		try {
			String linea = buffer.readLine();
			
		}catch (IOException e) {
			// TODO: handle exception
			throw new LecturaArchivoException(e.getMessage());
		}
		
		
	}


}
