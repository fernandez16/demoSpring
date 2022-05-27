package com.capgemini.beans;

public class Jugador{
	
	private int id;
	private String nombre;
	private IEquipo iequipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IEquipo getIequipo() {
		return iequipo;
	}

	public void setIequipo(IEquipo iequipo) {
		this.iequipo = iequipo;
	}

}
