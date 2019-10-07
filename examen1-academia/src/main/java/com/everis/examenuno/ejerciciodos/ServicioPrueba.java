package com.everis.examenuno.ejerciciodos;

import java.util.ArrayList;
import java.util.List;


public class ServicioPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		List<String> cadenas = new ArrayList<String>();
		cadenas.add("Cadena 1");
		cadenas.add("Cadena 2");
		cadenas.add("Cadena 3");
		cadenas.add("Cadena 4");
		cadenas.add("Cadena 5");
		
		ServicioConsola servicioConsola = new ServicioConsola();
		servicioConsola.exportar(cadenas);
		
		ServicioArchivo servicioArchivo = new ServicioArchivo();
		servicioArchivo.exportar(cadenas);
	}

}
