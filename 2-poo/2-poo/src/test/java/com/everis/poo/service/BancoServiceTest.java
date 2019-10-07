package com.everis.poo.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.everis.poo.model.Banco;

public class BancoServiceTest {
	private BancoService servicio = new BancoService();

	@Test
	public void testInsertarListar() {
		Banco banco = new Banco();
		banco.setNombre("bbva");
		banco.setDireccion("BilbaoViscaya");
		boolean insertado = servicio.insertar(banco);
		System.out.println(banco);
		Banco banco2 = new Banco();
		banco2.setNombre("bbva2");
		banco2.setDireccion("BilbaoViscaya");
		boolean insertado2 = servicio.insertar(banco2);
		
		assertTrue(insertado2);
		assertTrue(insertado);
			
		List<Banco> bancos = servicio.listar();
		
		for (Banco objBanco : bancos) {
			System.out.println(objBanco);			
		}
		
		assertTrue(bancos.size() >0);
	
	}
	

	@Test
	public void testBuscar() {
		Banco banco = new Banco();
		banco.setNombre("bbva3");
		banco.setDireccion("BilbaoViscaya");
		
		servicio.insertar(banco);
		
		Banco encontrado = servicio.buscar(banco.getIdBanco());
		assertNotNull(encontrado);
	}

	@Test
	public void testActualizar() {
		Banco banco = new Banco();
		banco.setNombre("bbva4");
		banco.setDireccion("BilbaoViscaya");
		servicio.insertar(banco);
		
		banco.setNombre("Citi");
		
		boolean actualizado = servicio.actualizar(banco);
		
		assertTrue(actualizado);
		
	}

	@Test
	public void testEliminar() {
		Banco banco2 = new Banco();
		banco2.setNombre("bbva7");
		banco2.setDireccion("BilbaoViscaya");
		boolean insertado2 = servicio.insertar(banco2);
		
		boolean eliminado = servicio.eliminar(banco2.getIdBanco());
		
		assertTrue(insertado2);
		assertTrue(eliminado==true);
		
	}

}
