package com.everis.examen1.equipo1.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.everis.examen1.equipo1.model.Compra;
import com.everis.examen1.equipo1.util.ConexionMySQL;

public class CompraDAO {
		
		ConexionMySQL conexion = new ConexionMySQL();	
		
		public boolean insertar(Compra compra) {
			String qyery = "INSERT INTO compra (fechacompra, total, idcliente) VALUES ('"+compra.getFechaCompra()+"', '"+compra.getTotal()+"', '1');";
			try {
				conexion.conectar();
				conexion.ejecutar(qyery);
				conexion.desconectar();
				return true;
			}catch(Exception e) {
				System.err.println(e.getMessage());
				return false;
			}
		}
		
		
		public List<Compra> listar(){
			List<Compra> compras = new ArrayList<Compra>();	
			String qyery = "SELECT * FROM compra order by idcompra";
			try {
				conexion.conectar();
				ResultSet rs = conexion.ejecutarConsulta(qyery);
				while(rs.next()) {
					Compra compraobj = new Compra();
					compraobj.setIdCompra(rs.getInt("idcompra"));
					compraobj.setFechaCompra(rs.getString("fechacompra"));
					compraobj.setTotal(rs.getDouble("total"));
					compraobj.setIdCliente(rs.getInt("idcliente"));
					compras.add(compraobj);
				}
				conexion.desconectar();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			return compras;
		}
}