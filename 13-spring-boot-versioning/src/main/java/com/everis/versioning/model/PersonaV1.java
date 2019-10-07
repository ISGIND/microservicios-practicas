package com.everis.versioning.model;


public class PersonaV1 {

	private String nombreCompleto;

	public PersonaV1(String nombreCompleto) {
		super();
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}	
}
