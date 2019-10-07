package com.everis;

import com.everis.poo.model.Cliente;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String json = convertirClienteJson();
        System.out.println(json);
    }
    
    public static String convertirClienteJson() {
    	Cliente cliente = new Cliente();
    	cliente.setIdCliente(13);
    	cliente.setNombre("Ivan");
    	cliente.setApaterno("Sanchez");
    	cliente.setAmaterno("Gonzalez");
    	cliente.setRfc("SAGI9511131D1");
    	
    	//cONVERTIR EL OBJETO CLIENTE EN JSON
    	Gson gson = new Gson();
    	String json = gson.toJson(cliente);//Convierte el objeto a json
    	return json;
    }
}
