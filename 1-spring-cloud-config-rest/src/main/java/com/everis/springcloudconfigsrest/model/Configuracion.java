package com.everis.springcloudconfigsrest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//Especifico el prefijo de los valores del properties( que vienen de github)
@ConfigurationProperties("config")
public class Configuracion {
	
	private String url;
	private String usuario;
	private String password;
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Configuracion [url=" + url + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	

}
