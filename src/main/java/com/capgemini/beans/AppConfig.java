package com.capgemini.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	// reemplaza al archivo beans.xml
	@Bean
	public HolaMundo mundo() {
		return new HolaMundo();
	}
	
	public Persona persona() {
		return new Persona();
	}
}
