package com.akshay.refrence;

public class Employe {
	private String name;
	private Address address;
	@Override
	public String toString() {
		return "Employe [name=" + name + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
