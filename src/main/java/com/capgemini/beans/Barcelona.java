package com.capgemini.beans;

import org.springframework.stereotype.Component;

@Component("equipo")
public class Barcelona implements IEquipo {

	@Override
	public String mostrar() {
		return this.getClass().getSimpleName();
	}

}
