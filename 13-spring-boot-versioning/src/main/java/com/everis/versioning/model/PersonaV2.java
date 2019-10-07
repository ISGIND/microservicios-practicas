package com.everis.versioning.model;

public class PersonaV2 {

	private String nombres;
	private String apaterno;
	private String amaterno;
	
	public PersonaV2(String nombres, String apaterno, String amaterno) {
		super();
		this.nombres = nombres;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApaterno() {
		return apaterno;
	}
	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}
	public String getAmaterno() {
		return amaterno;
	}
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}
}
