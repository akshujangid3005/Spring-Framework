package com.akshay.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/akshay/refrence/config.xml");
	   Employe emp=context.getBean("emp",Employe.class);
	   System.out.println(emp);
	
	}

}
