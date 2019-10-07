package com.everis.springcloudexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springcloudexchange.model.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	//Consultas personalizadas
	//Esto lo que hace es que filtra la consulta por 2 atributos (columnas) en este caso por from y to
	ExchangeValue findByFromAndTo(String from, String to);

}
