package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.Ciudad;
import com.capgemini.beans.HolaMundo;
import com.capgemini.beans.Person;
import com.capgemini.beans.Persona;

/**
 * Hello world!
 *
 */
public class App2 {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Persona thisPerson = (Persona) appContext.getBean("persona");

		System.out.println(thisPerson);
		System.out.println(thisPerson.getApodo());
		System.out.println(thisPerson.getPais().getNombre());
		System.out.println(thisPerson.getPais().getCiudad().getNombre());

		((ConfigurableApplicationContext) appContext).close();
	
	}

	public static void mainAlt(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Person thisPerson = (Person) appContext.getBean("person");

		System.out.println(thisPerson);
		System.out.println(thisPerson.getId());
		System.out.println(thisPerson.getNombre());
		System.out.println(thisPerson.getApodo());
		System.out.println(thisPerson.getCountry().getNombre());

		Person thisSecondPerson = (Person) appContext.getBean("person");

		System.out.println(thisSecondPerson);
		System.out.println(thisSecondPerson.getId());
		System.out.println(thisSecondPerson.getNombre());
		System.out.println(thisSecondPerson.getApodo());
		System.out.println(thisSecondPerson.getCountry().getNombre());

		((ConfigurableApplicationContext) appContext).close();
	
	}

}
