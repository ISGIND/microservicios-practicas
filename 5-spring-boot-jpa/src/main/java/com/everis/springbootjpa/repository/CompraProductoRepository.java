package com.everis.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjpa.model.Compraproducto;

@Repository
public interface CompraProductoRepository extends JpaRepository<Compraproducto, Integer> {

}
