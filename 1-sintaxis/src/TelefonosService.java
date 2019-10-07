import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TelefonosService {
	
/*	public void leerTelefonos() { //c:/temp/telefonos.txt
		BufferedReader listatelefonos;
		try {
			listatelefonos = new BufferedReader(new FileReader("C:/temp/telefonos.txt"));
			String linea = listatelefonos.readLine();
			while(linea != null) {
				String[] telefono = linea.split(",");
				System.out.println(telefono[1]);
				linea = listatelefonos.readLine();// lee la siguiente linea
			}
			listatelefonos.close();
			
		}catch(IOException e) {
		}
	}
	*/
	
	
	public void leerTelefonos() throws IOException {
		String ruta = "C:/temp/telefonos.txt";
		//abrir el archivo
		File archivo = new File(ruta);
		FileReader lector = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(lector);
		String linea;
		while((linea = buffer.readLine())!= null) {
			String[] contenido =linea.split(",");
			System.out.println(contenido[1]);
		}
		buffer.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			TelefonosService cliente = new TelefonosService();
			cliente.leerTelefonos();
	}

}
