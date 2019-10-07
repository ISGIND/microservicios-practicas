package com.everis.exceptions.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.everis.exceptions.exceptions.UsuarioNoEncontradoException;
import com.everis.exceptions.model.Usuario;
import com.everis.exceptions.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuarios/{id}")
	public Usuario buscarUsuario(@PathVariable int id) {
		Usuario usuario = usuarioService.findById(id);
		if (usuario == null) {
			throw new UsuarioNoEncontradoException("id-" + id);
		}
		return usuario;
	}

	@PostMapping("/usuarios")
	// Para habilitar las validaciones del modelo se agrega la anotacion @Valid
	public ResponseEntity<Object> crearUsuario(@RequestBody @Valid Usuario usuario) {
		Usuario usuarioInsertado = usuarioService.save(usuario);
		// Una alternativa al usar HateOAS seria vincular
		// por medio de ResponseEntity;
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(usuarioInsertado.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/usuarios/{id}")
	public void deleteUser(@PathVariable int id) {
		Usuario usuario = usuarioService.deleteById(id);
		if (usuario == null) {
			throw new UsuarioNoEncontradoException("id -"+id);
		}
	}
}
