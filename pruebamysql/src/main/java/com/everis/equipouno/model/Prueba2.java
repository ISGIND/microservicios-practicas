package com.everis.equipouno.model;
// Generated 20/09/2019 10:39:44 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Prueba2 generated by hbm2java
 */
@Entity
@Table(name = "prueba2", catalog = "dbprueba")
public class Prueba2 implements java.io.Serializable {

	private int id;
	private Prueba1 prueba1;
	private Prueba3 prueba3;

	public Prueba2() {
	}

	public Prueba2(int id, Prueba1 prueba1, Prueba3 prueba3) {
		this.id = id;
		this.prueba1 = prueba1;
		this.prueba3 = prueba3;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prueba1_id", nullable = false)
	public Prueba1 getPrueba1() {
		return this.prueba1;
	}

	public void setPrueba1(Prueba1 prueba1) {
		this.prueba1 = prueba1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prueba3_id", nullable = false)
	public Prueba3 getPrueba3() {
		return this.prueba3;
	}

	public void setPrueba3(Prueba3 prueba3) {
		this.prueba3 = prueba3;
	}

}
