package com.everis.poo.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.everis.poo.model.Cliente;

public class ClientServiceTest {
	private ClientService servicio = new ClientService();
	
	@Test // notacion forzosa para poder ejecutar el test
	public void testInsertarListar() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNombre("Ivan");
		cliente.setApaterno("Sanchez");
		cliente.setAmaterno("Gonzalez");
		cliente.setRfc("SAGI");
		servicio.insertar(cliente);
		Cliente cliente2 = new Cliente();
		cliente2.setIdCliente(2);
		cliente2.setRfc("SAGI1");
		boolean insertado2 = servicio.insertar(cliente2);
		
		List<Cliente> clientes = servicio.listar();
		assertTrue(clientes.size() >0);
		assertTrue(insertado2);
		for (Cliente objCliente : clientes) {
			System.out.println(objCliente);
		}
		
	}

	

	@Test
	public void testBuscar() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNombre("Ivan");
		cliente.setApaterno("Sanchez");
		cliente.setAmaterno("Gonzalez");
		cliente.setRfc("SAGI");
		
		servicio.insertar(cliente);
		
		Cliente encontrado = servicio.buscar(cliente.getIdCliente());
		assertNotNull(encontrado);
	}

	@Test
	public void testActualizar() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNombre("Ivan");
		cliente.setApaterno("Sanchez");
		cliente.setAmaterno("Gonzalez");
		cliente.setRfc("SAGI");
				
		Cliente cliente2 = new Cliente();
		cliente2.setIdCliente(6);
		cliente2.setNombre("Jorge");
		cliente2.setRfc("jope");
		
		servicio.insertar(cliente);
		servicio.insertar(cliente2);
		
		
		cliente2.setApaterno("perez");
		boolean actualizado = servicio.actualizar(cliente2);
		assertTrue(actualizado == true);		
	}

	@Test
	public void testEliminar() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNombre("Ivan");
		cliente.setApaterno("Sanchez");
		cliente.setAmaterno("Gonzalez");
		cliente.setRfc("SAGI");
				
		Cliente cliente2 = new Cliente();
		cliente2.setIdCliente(5);
		cliente2.setNombre("Jorge");
		
		servicio.insertar(cliente);
		servicio.insertar(cliente2);
		
		List<Cliente> clientes = servicio.listar();
		boolean eliminado = servicio.eliminar(cliente2.getIdCliente());
		assertTrue(eliminado==true);
		assertTrue(clientes.size()>0);
		
	}

}
