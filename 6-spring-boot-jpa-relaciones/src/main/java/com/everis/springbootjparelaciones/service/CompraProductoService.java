package com.everis.springbootjparelaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjparelaciones.model.Compraproducto;
import com.everis.springbootjparelaciones.repository.CompraProductoRepository;

@Service
public class CompraProductoService {
	@Autowired
	private CompraProductoRepository compraProductoRepository;
	
	public List<Compraproducto> listar(){
		return compraProductoRepository.findAll();
	}
}
