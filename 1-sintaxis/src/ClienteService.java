
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteService {
	
	public void calcularRfc(String nombre, String apaterno, String amaterno, Date nacimiento) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String fechaFormateada = sdf.format(new Date());
		
		System.out.println("RFC: "+apaterno.substring(0, 2)+ amaterno.substring(0, 1)+nombre.substring(0,1)+fechaFormateada);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ClienteService cliente = new ClienteService();
		cliente.calcularRfc("IVAN", "SANCHEZ", "GONZALEZ", new Date());
	}

}
