package com.akshay.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
 ApplicationContext context= 	new ClassPathXmlApplicationContext("com/akshay/spel/config.xml");
 Employe emp =context.getBean("employe",Employe.class);
System.out.println(emp);
}
}
