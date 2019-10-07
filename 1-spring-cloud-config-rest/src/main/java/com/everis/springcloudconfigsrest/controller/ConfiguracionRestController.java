package com.everis.springcloudconfigsrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springcloudconfigsrest.model.Configuracion;

@RestController
public class ConfiguracionRestController {

	//Equivalente a un autowired, pero solo trae un valor
	@Value("${config.usuario}")
	private String usuario;
	
	@Autowired
	private Configuracion configuracion;
	
	@GetMapping("/usuario")
	public String obtenerUsuario() {
		return usuario;
	}
	
	@GetMapping("/configuracion")
	public String obtenerConfiguracion() {
		return configuracion.toString();
	}
}
