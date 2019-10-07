package com.everis.springcloudconversion.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.springcloudconversion.responses.CurrencyConversionResponse;

// SE TIENE QUE HACER REFERENCIA AL NOMBRE QUE APARECE REGISTRADO EN EUREKA  O DIRECTAMENTE COMO EL NOMBRE DE LA APLICACION EN MAYUSCULAS
@FeignClient(name = "SPRING-CLOUD-EXCHANGE-REST")
@RibbonClient(name = "SPRING-CLOUD-EXCHANGE-REST")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionResponse retrieveExchange(@PathVariable String from,@PathVariable String to);
}
