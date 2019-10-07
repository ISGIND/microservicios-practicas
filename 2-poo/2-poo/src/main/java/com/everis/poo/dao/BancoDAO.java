/**
 * Class Data Access Object , tambien llamado Repository
 * Clase solo de lectura y modificacion de la informacion 
 * 
 */
package com.everis.poo.dao;
import java.util.ArrayList;
import java.util.List;

import com.everis.poo.model.Banco;

public class BancoDAO {
	private static List<Banco> bancos = new ArrayList<>();
	
	public List<Banco> listar(){
		return bancos;
	}
		
	public void insertar(Banco banco)
	{
		bancos.add(banco);
	}
	
	
	public Banco buscar(int idBanco) {
		for (Banco banco : bancos) {
			if(banco.getIdBanco() == idBanco) {
				return banco;				
			}
		}
		return null;
	}
	
	public boolean actualizar(Banco banco) {
		Banco encontrado = buscar(banco.getIdBanco());
		if(encontrado != null) {
			encontrado.setNombre(banco.getNombre());
			encontrado.setDireccion(banco.getDireccion());
			return true;
		}
		return false;
	}
	
	public boolean eliminar(int idBanco) {
		Banco encontrado = buscar(idBanco);
		if(encontrado != null) {
			bancos.remove(encontrado);
			return true;
		}
		return false;
	}
	
}
