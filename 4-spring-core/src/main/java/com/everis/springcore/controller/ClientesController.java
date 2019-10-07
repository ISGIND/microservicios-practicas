package com.everis.springcore.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springcore.model.Cliente;
import com.everis.springcore.service.ClientService;

@RestController
@RequestMapping("/clientes") //Es el contexto raiz seria como la carpeta principal y los servicios creados son subcarpetas
public class ClientesController {
	
	/*
	 * Autocablea, inyeccion de dependencias
	 * Busca spring un objeto de este tipo en su contexto
	 */
	@Autowired
	private ClientService clienteService;
	
	
	@GetMapping("/")
	public List<Cliente> listar(){
		return clienteService.listar();
	}
	
	@GetMapping("/exportar")
	public ResponseEntity<Object> exportarXLS() throws FileNotFoundException{
		String rutaArchivo = "C:/temp/clientes.xlsx";
		clienteService.exportar(rutaArchivo);
		
		File archivo = new File(rutaArchivo);
		
		InputStreamResource resource = new InputStreamResource(new FileInputStream(archivo));
		
		ResponseEntity<Object> respuesta = ResponseEntity.ok().contentLength(archivo.length())
				.contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")).body(resource);
		return respuesta;
	}
	
	
	@PostMapping("/")
	public boolean insertar(@RequestBody Cliente cliente) {
		return clienteService.insertar(cliente);
	}
	
	@PutMapping("/")
	public boolean actualizar(@RequestBody Cliente cliente) {
		return clienteService.actualizar(cliente);
	}
	
	@DeleteMapping("/{idCliente}")
	public boolean eliminar(@PathVariable int idCliente) {
		return clienteService.eliminar(idCliente);
	}
	
	
}
