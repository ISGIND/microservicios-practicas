package com.everis.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjpa.model.Categoria;
import com.everis.springbootjpa.repository.CategoriaRespository;

@Service
public class CategoriaService {
	
	 // obtiene un objeto del contexto de Springn// solo hay un solo objeto en memoria, 
	//obtiene siempre la misma instacia (Singleton)
	@Autowired
	private CategoriaRespository categoriaRepository;
	
	public List<Categoria> listar(){
		return categoriaRepository.findAll();//JPARespository SELECT * FROM categoria
	}
	
	public Categoria insertar(Categoria categoria) {
		return categoriaRepository.save(categoria);//Insert into y regresa todo el objeto ya con todo los datos de la tabla incluido el ID
	}
	
	public Categoria actualizar(Categoria categoria) {		
		return categoriaRepository.save(categoria);
	}
	
	public boolean eliminar(Categoria categoria) {
		try {
			categoriaRepository.delete(categoria);
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}
}
