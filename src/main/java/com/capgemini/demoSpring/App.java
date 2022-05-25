package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.beans.HolaMundo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	HolaMundo m = new HolaMundo();
//    	m.setSaludo("holaa");
//    	System.out.println(m.getSaludo());

    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");
    	
    	ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");
    	
    	HolaMundo hola = (HolaMundo) appContext.getBean("mundo");
    	
    	System.out.println(hola.getSaludo());
    
    	((ConfigurableApplicationContext)appContext).close(); // libera los recursos de la linea 22
    }
}
