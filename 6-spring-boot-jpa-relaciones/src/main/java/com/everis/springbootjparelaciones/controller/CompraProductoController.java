package com.everis.springbootjparelaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springbootjparelaciones.model.Compraproducto;
import com.everis.springbootjparelaciones.service.CompraProductoService;

@RestController
@RequestMapping("/compraproductos")
public class CompraProductoController {

	@Autowired
	private CompraProductoService compraProductoService;
	
	@GetMapping("")
	public List<Compraproducto>listar(){
		return compraProductoService.listar();
	}
}
