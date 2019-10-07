package com.everis.examenuno.ejerciciotres;

public class pruebaServicioEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEmail servicio = new ServicioEmail();
		servicio.enviarCorreo("guerrerog@gmail.com", "Academia-Everis-Examen1", "Ya estuvo el examen profe XD");
		servicio.enviarCorreoHTML("guerrerog@gmail.com", "Academia-Everis-Examen1", "<h1>Ya estuvo el examen profe XD</h1>");
		System.out.println("Chingon s");
	}

}
