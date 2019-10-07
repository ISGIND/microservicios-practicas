import java.util.Date;

public class Singleton {
	//Objeto es compartido en toda la maquina virtual de java
	static Date fechaActual;
		
	public static void main(String[] args) {
		fechaActual = new Date();
		String fecha = fechaActual.toString();
		//El patron singleton:Cuando aseguras que siempre existira solamente un objeto de tipo fechaActual;
		if(fechaActual == null) {
			fechaActual = new Date();			
		}else {
			System.out.println("Fecha actual es:" + fechaActual);
		}
	}
}