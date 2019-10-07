
public class HolaMundo {
	
	public static void main(String []args) {
		System.out.println("Hola Mundo");
		//No se puede acceder a metodos no estaticos desde metodos estaticos; Error de compilacion
		//calcularNomina(5);
		HolaMundo hola = new HolaMundo();
		hola.calcularNomina(8);
	}
	public void calcularNomina(int  numeroEmpleado){
		System.out.println("Calculando nomina de la clase B");
	}
}
