package com.akshay.autowire.annotaion;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("com/akshay/autowire/annotaion/config.xml");
		Employe emp= context.getBean("emp",Employe.class);
		System.out.println(emp);
	}

} 

