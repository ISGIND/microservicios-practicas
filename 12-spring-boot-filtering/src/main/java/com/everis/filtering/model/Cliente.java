package com.everis.filtering.model;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("ClienteModelFilter")
public class Cliente {

	private int idCliente;
	private String nombre;
	private String rfc;
	private int edad;
	
	public Cliente(int idCliente, String nombre, String rfc, int edad) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.rfc = rfc;
		this.edad = edad;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
