package com.everis.poo.service;

import java.util.List;

import com.everis.poo.dao.BancoDAO;
import com.everis.poo.model.Banco;

public class BancoService {
	private BancoDAO bancoDAO = new BancoDAO();
	public List<Banco> listar(){
		return bancoDAO.listar();
	}
	
	public boolean insertar(Banco banco) {
		List<Banco> bancos = bancoDAO.listar();
		for (Banco duplicado : bancos) {
			if(duplicado.getNombre().equals(banco.getNombre())) {
				return false;
			}
		}
		bancoDAO.insertar(banco);
		return true;
	}
	
	public Banco buscar(int idBanco) {
		return bancoDAO.buscar(idBanco);
	}
	
	public boolean actualizar(Banco banco) {
		return bancoDAO.actualizar(banco);
	}
	
	public boolean eliminar(int idBanco) {
		return bancoDAO.eliminar(idBanco);
	}
}


