package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("messi")
public class Jugador{
	
	private int id;
	
	@Value("Lionel Messi")
	private String nombre;
	
	@Autowired
	private IEquipo equipo;

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

	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}
