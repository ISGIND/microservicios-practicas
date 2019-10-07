package com.everis.examenuno.ejerciciodos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ServicioArchivo extends Servicio{
	
	@Override
	public void exportar(List<String> cadenas) {
		// TODO Auto-generated method stub
		String ruta = "C:/temp/cadenas.txt";
		File file = new File(ruta);
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file); 
			for (String cadena : cadenas) {
					writer.write(cadena);
			}
			writer.flush();
			writer.close();	
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
			
	}

}
