package com.akshay.autowire.xml;

public class Employe {

	private Address address;

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
