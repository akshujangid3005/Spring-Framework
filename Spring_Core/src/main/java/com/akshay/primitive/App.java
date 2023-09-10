package com.akshay.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	
	ApplicationContext context=    new ClassPathXmlApplicationContext("com/akshay/primitive/config.xml");
	Employe employe1 =context.getBean("emp1",Employe.class);
	System.out.println(employe1);
//	Employe employe2 =context.getBean("emp2",Employe.class);
//	System.out.println(employe2);
//	Employe employe3 =context.getBean("emp3",Employe.class);
//	System.out.println(employe3);
}
}

