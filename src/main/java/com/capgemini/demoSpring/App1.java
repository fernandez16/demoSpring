package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.Ciudad;
import com.capgemini.beans.HolaMundo;
import com.capgemini.beans.Persona;

/**
 * Hello world!
 *
 */
public class App1 {

	public static void main(String[] args) {

//    	viejo modo:
//    	HolaMundo m = new HolaMundo();
//    	m.setSaludo("holaa");
//    	System.out.println(m.getSaludo());

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Persona estaPersona = (Persona) appContext.getBean("persona");

		System.out.println(estaPersona.getId());
		System.out.println(estaPersona.getNombre());
		System.out.println(estaPersona.getApodo());
		System.out.println(estaPersona.getPais().getNombre());
		System.out.println(estaPersona.getPais().getCiudades());

		for (Ciudad ciu: estaPersona.getPais().getCiudades()) {
			System.out.println(ciu.getNombre());
		}

//		Persona estaSegundaPersona = (Persona) appContext.getBean("thisPersonsBean");
//
//		System.out.println(estaSegundaPersona.getId());
//
//		Persona estaTerceraPersona = (Persona) appContext.getBean("thisPersonsAlias");
//
//		System.out.println(estaTerceraPersona.getNombre());

		((ConfigurableApplicationContext) appContext).close(); // libera los recursos
	}

	public static void mainAlt3(String[] args) {

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();

		HolaMundo hola = (HolaMundo) appContext.getBean("mundo");
		HolaMundo hola2 = (HolaMundo) appContext.getBean("marte");

		System.out.println(hola.getSaludo());
		System.out.println(hola2.getSaludo());

		((AnnotationConfigApplicationContext) appContext).close(); // libera los recursos

	}

	public static void mainAlt2(String[] args)

	{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

		HolaMundo hola = (HolaMundo) appContext.getBean("mundo");
		HolaMundo hola2 = (HolaMundo) appContext.getBean("marte");

		System.out.println(hola.getSaludo());
		System.out.println(hola2.getSaludo());

		((AnnotationConfigApplicationContext) appContext).close(); // libera los recursos
	}

	public static void mainAlt1(String[] args) {

//    	viejo modo:
//    	HolaMundo m = new HolaMundo();
//    	m.setSaludo("holaa");
//    	System.out.println(m.getSaludo());

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		HolaMundo hola = (HolaMundo) appContext.getBean("mundo");
		HolaMundo hola2 = appContext.getBean(HolaMundo.class);

		System.out.println(hola.getSaludo());
		System.out.println(hola2.getSaludo());

		((ConfigurableApplicationContext) appContext).close(); // libera los recursos
	}

}
