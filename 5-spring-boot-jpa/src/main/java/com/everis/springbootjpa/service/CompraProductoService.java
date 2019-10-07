package com.everis.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjpa.model.Compraproducto;
import com.everis.springbootjpa.repository.CompraProductoRepository;

@Service
public class CompraProductoService {
	
	@Autowired
	private CompraProductoRepository compraProductoRepository;
	
	public List<Compraproducto> listar() {
		return compraProductoRepository.findAll();
		
	}
	
	
	public Compraproducto insertar(Compraproducto compraProducto) {
		return compraProductoRepository.save(compraProducto);
	}
	
	public Compraproducto actualizar(Compraproducto compraProducto) {
		return compraProductoRepository.save(compraProducto);
	}
	
	public boolean eliminar(Compraproducto compraProdcuto) {
		if(compraProductoRepository.existsById(compraProdcuto.getIdcompraproducto())){
			compraProductoRepository.delete(compraProdcuto);
			return true;
		}else {
			return false;
		}
	}

}
