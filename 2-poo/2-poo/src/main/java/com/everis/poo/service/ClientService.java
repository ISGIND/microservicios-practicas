package com.everis.poo.service;
/**
 * Regla de negocio relacionada a clientes
 * @author Dell5458
 *
 */

import java.util.List;

import com.everis.poo.dao.ClienteDAO;
import com.everis.poo.model.Cliente;

public class ClientService {
	private ClienteDAO clienteDAO = new ClienteDAO();
	public List<Cliente> listar(){
		return clienteDAO.listar();
	}
	
	public boolean insertar(Cliente cliente) {
		List<Cliente> clientes = clienteDAO.listar();
		for (Cliente duplicado : clientes) {
			if(duplicado.getRfc().equals(cliente.getRfc())) {
				return false;
			}
		}
		clienteDAO.insertar(cliente);
		return true;
	}
	
	public Cliente buscar(int idCliente) {
		return clienteDAO.buscar(idCliente);
	}
	
	public boolean actualizar(Cliente cliente) {
		return clienteDAO.actualizar(cliente);
	}
	
	public boolean eliminar(int idCliente) {
		return clienteDAO.eliminar(idCliente);
	}
}
