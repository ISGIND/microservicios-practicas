package com.everis.examenuno.ejerciciotres;
//Contrato de servicios
public interface IServicioEmail {
		public void enviarCorreo(String email, String asunto, String texto);
		public void enviarCorreoHTML(String email, String asunto, String html);
}
