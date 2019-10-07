package com.everis.springcloudconfigrest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("parametros")
public class Configuracion {
	
	private double descuento;

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Configuracion [descuento=" + descuento + "]";
	}
	
	

}
