package com.everis.examenuno.ejerciciodos;

import java.util.List;

public class ServicioConsola extends Servicio {

	@Override
	public void exportar(List<String> cadenas) {
		// TODO Auto-generated method stub
		for (String string : cadenas) {
			System.out.println(string);
		}
		
	}

}
