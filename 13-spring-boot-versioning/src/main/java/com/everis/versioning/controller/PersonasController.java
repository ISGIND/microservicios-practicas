package com.everis.versioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.versioning.model.PersonaV1;
import com.everis.versioning.model.PersonaV2;

@RestController
public class PersonasController {

	@GetMapping("/v1/persona")
	public PersonaV1 personaV1() {
		return new PersonaV1("IvanSanchez");
	}
	//Versionado por uri //TWITTER
	@GetMapping("/v2/persona")
	public PersonaV2 personaV2() {
		return new PersonaV2("Ivan", "Sanchez", "Gonzalez");
	}
	
	//VERSIONADO QUERY STRING AMAZON
	@GetMapping(value="/persona/param", params="version=1")
	public PersonaV1 personaParamV1() {
		return new PersonaV1("IvanSanchez");
	}
	@GetMapping(value="/persona/param", params="version=2")
	public PersonaV2 personaParamV2() {
		return new PersonaV2("Ivan", "Sanchez", "Gonzalez");
	}
	
	//Versionamiento por Headers de Microsoft
	@GetMapping(value="/persona/header", headers="X-API-VERSION=1")
	public PersonaV1 personaHeaderV1() {
		return new PersonaV1("IvanSanchez");
	}
	@GetMapping(value="/persona/header", headers="X-API-VERSION=2")
	public PersonaV2 personaHeaderV2() {
		return new PersonaV2("Ivan", "Sanchez", "Gonzalez");
	}
	
	//Versionamiento por MEdiaType
	@GetMapping(value="/persona/mediatype", produces="application/vnd.com.everis.app-v1+json")
	public PersonaV1 personaMediaTypeV1() {
		return new PersonaV1("IvanSanchez");
	}
	@GetMapping(value="/persona/mediatype", produces="application/vnd.com.everis.app-v2+json")
	public PersonaV2 personaMediaTypeV2() {
		return new PersonaV2("Ivan", "Sanchez", "Gonzalez");
	}
	
}

	

