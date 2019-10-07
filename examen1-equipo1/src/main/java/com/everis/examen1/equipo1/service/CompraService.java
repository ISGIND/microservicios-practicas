package com.everis.examen1.equipo1.service;

import java.util.List;

import com.everis.examen1.equipo1.dao.CompraDAO;
import com.everis.examen1.equipo1.model.Compra;

public class CompraService {

	private CompraDAO compraDAO = new CompraDAO();

	public List<Compra> listar() {
		return compraDAO.listar();
	}

	public boolean insertar(Compra compra) {
		compraDAO.insertar(compra);
		return true;
	}

}
