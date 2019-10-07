// por definicion solo se encarga de meter y extraer datos a la tabla
package com.everis.springcore.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.everis.springcore.model.Cliente;


@Repository //Repositorio es un objeto de acceso a datos, spring le llama asi a los dao's
public class ClienteDAO {
	private static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public List<Cliente> listar(){
		return clientes;
	}
	
	public void insertar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Cliente buscar(int idCliente) {
		for (Cliente cliente : clientes) {
			if(cliente.getIdCliente() == idCliente) {
				return cliente;				
			}
		}
		return null;
	}
	
	public boolean actualizar(Cliente cliente) {
		Cliente encontrado = buscar(cliente.getIdCliente());
		if(encontrado != null) {
			encontrado.setNombre(cliente.getNombre());
			encontrado.setApaterno(cliente.getApaterno());
			encontrado.setAmaterno(cliente.getAmaterno());
			encontrado.setRfc(cliente.getRfc());
			return true;
		}
		return false;
	}
	
	
	public boolean eliminar(int idCliente) {
		Cliente encontrado = buscar(idCliente);
		if(encontrado != null) {
			clientes.remove(encontrado);
			return true;
		}
		return false;
	}
}
