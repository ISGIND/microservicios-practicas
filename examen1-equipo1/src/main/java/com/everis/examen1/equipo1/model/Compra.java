package com.everis.examen1.equipo1.model;

public class Compra {
	
	private int idCompra;
	private String fechaCompra;
	private Double total;
	private int idCliente;
	
	public int getIdCompra() {
		return idCompra;
	}



	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}



	public String getFechaCompra() {
		return fechaCompra;
	}



	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}



	public Double getTotal() {
		return total;
	}



	public void setTotal(Double total) {
		this.total = total;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Compra [idcompra=" + idCompra + ", fechaCompra=" + fechaCompra + ", total=" + total + ", idCliente="
				+ idCliente + "]";
	}
	
	
}