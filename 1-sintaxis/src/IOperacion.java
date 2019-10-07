/*
 *
 * @author Dell5458
 *Una interface solo permite definir los metodos, no implementarlos.
 *No se puede instanciar, es decir, no se puede utilizar el operador new. Se necesita implentar en otra clase
 */
public interface IOperacion {
	public double sumar(double x, double y);
	public double restar(double x, double y);
	public double dividir(double x, double y);
	public double multiplicar(double x, double y);
}
