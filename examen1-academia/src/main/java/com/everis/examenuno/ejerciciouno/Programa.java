package com.everis.examenuno.ejerciciouno;

import java.util.HashMap;
import java.util.Map.Entry;

public class Programa {

	public void analizarTexto(String cadena) {
		int count = 0; // contador de caracteres sin espacio 
        for(int i = 0; i < cadena.length(); i++) {    
            if(cadena.charAt(i) != ' ')    
                count++;    
        }    
		System.out.println("El numero de caracteres de la cadena es "+count);
		
		//Imprime la cadena en mayusculas
		String cadenaMayusculas = cadena.toUpperCase(); 
		System.out.println(cadenaMayusculas);
		
		
		//Contado de letras
		String cadenaSinEspacios = cadenaMayusculas.replaceAll("\\s+", "");
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		  
        
        char[] strArray = cadenaSinEspacios.toCharArray();
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
  
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            { 
                charCountMap.put(c, 1);
            }
        }
  
        for (Entry<Character, Integer> entry : charCountMap.entrySet()) { 
            System.out.println(entry.getValue() + " letra " +entry.getKey() ); 
        } 
    }
		
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programa programa = new Programa();
		programa.analizarTexto("Hola Academia Everis");
	}

}
