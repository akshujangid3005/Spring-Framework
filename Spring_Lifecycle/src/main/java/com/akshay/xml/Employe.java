package com.akshay.xml;

public class Employe {

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
	
	public void init() {
		System.out.println("init call: initilaizer");
		
	}
	public void destroy() {
		System.out.println("Destroy call :initilaizer");
	}
}
