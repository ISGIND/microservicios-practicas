package com.everis.equipouno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipouno.model.Curso;
import com.everis.equipouno.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/")
	public List<Curso> listar(){
		return cursoService.listar();
	}
	
	@PostMapping("/")
	public Curso insertar(@RequestBody Curso curso) {
		return cursoService.insertar(curso);
	}
	
	@PutMapping("/")
	public Curso actualizar(@RequestBody Curso curso) {
		return cursoService.actualizar(curso);
	}
	
	@DeleteMapping("/{id}")
	public boolean borrar(@PathVariable int id) {
		return cursoService.borrar(id);
	}
}
