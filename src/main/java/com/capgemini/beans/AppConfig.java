package com.capgemini.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	public HolaMundo mundo() {
		return new HolaMundo();
	}
}
