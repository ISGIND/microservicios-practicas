package com.everis.examen2academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.examen2academia.model.Producto;
import com.everis.examen2academia.service.ProductoService;


@RestController
@RequestMapping("productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("/busqueda")
	@ResponseBody
	public List<Producto> consultarProductos(@RequestParam String productoBuscado)
	{
//		return calendarioService.consultarInscripciones(idCalendario);
		List<Producto> encontrados = productoService.buscar(productoBuscado);
		return encontrados;
		
		
	}
	

	@GetMapping("/")
	public List<Producto> listar() {
		return productoService.listar();
	}

	@PostMapping("/")
	public Producto insertar(@RequestBody Producto Producto) {
		return productoService.insertar(Producto);
	}

	@PutMapping("/")
	public Producto actualizar(@RequestBody Producto Producto) {
		return productoService.actualizar(Producto);
	}

	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable int id) {
		return productoService.eliminar(id);
	}

}
