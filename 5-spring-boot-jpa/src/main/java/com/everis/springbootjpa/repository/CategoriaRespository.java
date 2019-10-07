package com.everis.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjpa.model.Categoria;

@Repository
public interface CategoriaRespository extends JpaRepository<Categoria, Integer>{
	//AL heredar de JPARepositry ya esta el CRUD hecho.
}
