package com.everis.exceptions.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Usuario {

	//Wrapper vs Primitivo
	private Integer id;

	// notacion para hacer validaciones
	@Size(min=3, message="Nombre debe tener al menos 2 caracteres")
	private String nombre;
	
	//Valida que la fecha sea anterior a la actual, en caso contrario @Future, y @Present para que sea referente a la fecha actual
	@Past
	private Date fechaNacimiento;

	public Usuario(Integer id, @Size(min = 3) String nombre, @Past Date fechaNacimiento) {
		//super es para invocar metodos, atributos o constructores de la clase padre, 
		//en este caso la clase padre es object super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
