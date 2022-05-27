package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.Ciudad;
import com.capgemini.beans.HolaMundo;
import com.capgemini.beans.Jugador;
import com.capgemini.beans.Person;
import com.capgemini.beans.Persona;

/**
 * Hello world!
 *
 */
public class App3 {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Jugador messi = (Jugador) appContext.getBean("Messi");

		System.out.println(messi.getId());
		System.out.println(messi.getNombre());
		System.out.println(messi.getEquipo().mostrar());

		((ConfigurableApplicationContext) appContext).close();

	}
}
