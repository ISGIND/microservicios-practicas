package com.everis.springbootjparelaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjparelaciones.model.Compraproducto;

@Repository
public interface CompraProductoRepository extends JpaRepository<Compraproducto, Integer> {

}