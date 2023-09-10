package com.akshay.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/akshay/collection/config.xml");
		Employe emp= context.getBean("emp1",Employe.class);
		System.out.println(emp);
	}  

}
