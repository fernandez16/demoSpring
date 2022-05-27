package com.capgemini.beans;

public class Barcelona implements IEquipo {

	@Override
	public String mostrar() {
		return this.getClass().getSimpleName();
	}

}
