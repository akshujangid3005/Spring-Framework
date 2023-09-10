package com.akshay.ci;

public class Employe {

	private int id;
	private String name;
	
	public Employe (int id , String name) {
		System.out.println("Constructor was calling in this programme");
		
		this.id=id;
		this.name=name;
		
		
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
}
