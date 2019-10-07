package com.everis.hateoas.model;

import org.springframework.hateoas.ResourceSupport;

// para que pueda suportar las ruta de hateOAS heredar de la clase ResourceSupport
public class Producto extends ResourceSupport{

	private int idProducto;
	private String nombre;
	
	public Producto(int id, String nombre)
	{
		this.idProducto = id;
		this.nombre = nombre;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setId(int id) {
		this.idProducto = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
