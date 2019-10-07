package com.everis.springcloudconfigrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springcloudconfigrest.model.Configuracion;



@RestController
public class ConfiguracionRestController {
 
	//Cuando son pocos parametros 
	@Value("${parametros.descuento}")
	private double descuento;
	
	@Autowired
	private Configuracion configuracion;
	
	
	@GetMapping("/calcularTotal/{cantidad}")
//	@ResponseBody
	public double descuento(@PathVariable double cantidad) {
		double resultado = cantidad - (cantidad*descuento/100);
		return resultado;
	}	
	
	@GetMapping("/calcTotal/{cantidad}")
	public double descuentos(@PathVariable double cantidad) {
		double resultado = cantidad - (cantidad*configuracion.getDescuento()/100);
		return resultado;
	}
	
}
