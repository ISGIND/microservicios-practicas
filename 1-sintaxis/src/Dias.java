/**
 * 
 * @author Dell5458
 *Una enumeracion es en si tambien una clase, pero no se puede instanciar;
 *Es un  catalogo finito de datos (pequeños)
 *Las con
 */
public enum Dias {
	LUNES(1,"Monday"), MARTES(2, "Tuesday"), MIERCOLES(3, "Wednesday"), JUEVES(4, "Thursday"), VIERNES(5, "Friday");
	
	private int idDia;
	private String name;
	
	private Dias(int idDia, String name) {
		this.idDia = idDia;
		this.name = name;
	}
	
	public int getIdDia() {
		return idDia;
	}
	
	public String getName() {
		return name;
	}
	
}
