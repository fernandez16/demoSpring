package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Value;

public class HolaMundo {

	@Value("oli @value")
	private String saludo; // = "oli";

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}
