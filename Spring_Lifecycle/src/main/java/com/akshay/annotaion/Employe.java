package com.akshay.annotaion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employe{

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("initilaizer object");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroye object");
		
	}
	
	
}
