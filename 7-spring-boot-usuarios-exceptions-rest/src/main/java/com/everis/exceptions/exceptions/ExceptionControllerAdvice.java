package com.everis.exceptions.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

//Aviso en caso de un error 
@ControllerAdvice
@RestController
public class ExceptionControllerAdvice {

	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public final ResponseEntity<ExceptionResponse>
					handleUserNotFoundException(UsuarioNoEncontradoException ex,
							WebRequest request){
		ExceptionResponse response = new
				ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
	}
}
