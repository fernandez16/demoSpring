package com.capgemini.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pais {

	private String nombre;
	private Ciudad ciudad;
	private List<Ciudad> ciudades;
	
	@PostConstruct
	private void init() {
		System.out.println("antes de iniciar el bean");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("apunto de destruir el bean");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

}
