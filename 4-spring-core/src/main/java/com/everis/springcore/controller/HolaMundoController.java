package com.everis.springcore.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.ws.Response;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springcore.model.Producto;

@RestController
public class HolaMundoController {
	
	
		@GetMapping("/descargar")//REgresar respuesta especifica
		public ResponseEntity<Object> descargar() throws FileNotFoundException{
			String imagen = "C:/temp/imagen.jpg";
			File archivo = new File(imagen);
			InputStreamResource resource = new InputStreamResource(new FileInputStream(archivo));
			
			ResponseEntity<Object> respuesta = ResponseEntity.ok().contentLength(archivo.length()).
					contentType(MediaType.IMAGE_JPEG).body(resource);
			return respuesta;
		}
		
		
		@GetMapping("/saludar")
		public String saludar() {
			return "Hola Spring Boot";
		}
		
		@PostMapping("/sumar/{x}/{y}")
		public double sumar(@PathVariable double x, @PathVariable double y) {
			return x+y;
		}
		
		
		@PutMapping("/validar")
		public String validar(@RequestBody Producto producto) {
			return producto.toString();
		}
		
		@DeleteMapping("/eliminar/{idProducto}")
		public void eliminar(@PathVariable("idProducto") int id) { // En pathvariable mapea el parametro a la varaible id
			System.out.println("Eliminando producto: "+id);
		}
		
		
		@GetMapping("/enviar")
		public String enviar(@RequestParam String mensaje) {
			return "El mensaje fue:"+mensaje;
		}
		
}
