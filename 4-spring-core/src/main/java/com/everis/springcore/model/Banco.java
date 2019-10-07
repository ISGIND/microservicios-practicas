package com.everis.springcore.model;

public class Banco {
	private int idBanco;
	private String nombre;
	private String direccion;
	
	private static int idBancario=1;
	
	public Banco() {
		this.idBanco =idBancario ++;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdBanco() {
		return idBanco;
	}
	
	@Override
	public String toString() {
		return "Banco [idBanco=" + idBanco + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	

}
