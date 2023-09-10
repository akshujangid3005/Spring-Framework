package com.akshay.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	
	ApplicationContext context= new ClassPathXmlApplicationContext("com/akshay/ci/config.xml");
	 Employe emp= context.getBean("emp",Employe.class);
    System.out.println(emp);




} 
}
