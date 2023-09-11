package com.akshay.autowire.annotaion;

import org.springframework.beans.factory.annotation.Autowired;

public class Employe {

	
   
	private Address address;
	
	
	
	public Employe(Address address) {
		super();
	   this.address=address;
	   System.out.println("Constructor injection");
   
	
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
    
	
	public void setAddress(Address address) {
		System.out.println("Setter injection");
		this.address = address;
	}
}
