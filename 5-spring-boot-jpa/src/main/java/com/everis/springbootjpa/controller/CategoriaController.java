package com.everis.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springbootjpa.model.Categoria;
import com.everis.springbootjpa.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired //inyectar un objeto, que existe en el contexto de spring 
	private CategoriaService categoriaService;
	
	@GetMapping("/")
	public List<Categoria> listar(){
		return categoriaService.listar();
	}
	
	@PostMapping("/")//verbos http
	public Categoria insertar(@RequestBody Categoria categoria) {
		return categoriaService.insertar(categoria);
	}
	
	@PutMapping("/")
	public Categoria actualizar(@RequestBody Categoria categoria) {
		return categoriaService.actualizar(categoria);
	}
	
	@DeleteMapping("/")
	public boolean eliminar(@RequestBody Categoria categoria) {
		return categoriaService.eliminar(categoria);
	}
	
}
