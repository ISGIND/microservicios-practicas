package com.everis.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springbootjpa.model.Compraproducto;
import com.everis.springbootjpa.service.CompraProductoService;

@RestController
@RequestMapping("/compraproducto")
public class CompraProductoController {
	
	@Autowired
	private CompraProductoService compraProductoService;
	
	@GetMapping("/")
	public List<Compraproducto> listar(){
		return compraProductoService.listar();
	}
	@PostMapping("/")
	public Compraproducto insertar(@RequestBody Compraproducto compraProducto){
		return compraProductoService.insertar(compraProducto);
	}
	
	@PutMapping("/")
	public Compraproducto actualizar(@RequestBody Compraproducto compraProducto){
		return compraProductoService.actualizar(compraProducto);
	}
	
	@DeleteMapping("/")
	public boolean eliminar(@RequestBody Compraproducto compraProducto ) {
		return compraProductoService.eliminar(compraProducto);
	}
	
}
