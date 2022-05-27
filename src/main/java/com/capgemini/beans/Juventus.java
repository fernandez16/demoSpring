package com.capgemini.beans;

public class Juventus implements IEquipo {

	@Override
	public String mostrar() {
		return this.getClass().getSimpleName();
	}

}
