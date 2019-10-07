package com.everis.springcloudconversion.rest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.everis.springcloudconversion.proxy.CurrencyExchangeServiceProxy;
import com.everis.springcloudconversion.responses.CurrencyConversionResponse;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionResponse convert(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		
		
		//Para invocar un servicio rest lo hicimos de 3 maneras Postman, JQuery, Resteasy y ahora
		//Se utilizara RestTemplate -> Clase que provee spring boot para consumir servcios.
		
		CurrencyConversionResponse response = new CurrencyConversionResponse();
		try {
			response = currencyExchangeServiceProxy.retrieveExchange(from, to);
			response.setTotal(quantity.multiply(response.getValue().getFactor()));
			response.setSuccessful(true);
			response.setMessage("Conversion exitosa");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			response.setSuccessful(false);
			response.setMessage(e.getMessage());
		}		
		return response;
	}
}