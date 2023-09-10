package com.akshay.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/akshay/annotaion/config.xml");
	context.registerShutdownHook();
	Employe emp= context.getBean("emp",Employe.class);
	System.out.println(emp);
	
	}
}
