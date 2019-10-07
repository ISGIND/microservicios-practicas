package com.everis.exceptions.exceptions;

import java.util.Date;

public class ExceptionResponse {

	private Date fechaHora;
	private String mensaje;
	private String detalle;
	
	public ExceptionResponse(Date fechaHora, String mensaje, String detalle) {
		super();
		this.fechaHora = fechaHora;
		this.mensaje = mensaje;
		this.detalle = detalle;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
