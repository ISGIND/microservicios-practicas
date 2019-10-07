package com.everis.exceptions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Para que no la necesitemos atrapar con u try cath se cambia a runtime
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException(String mensaje) {
		// TODO Auto-generated constructor stub
		super(mensaje);
	}

	
}
