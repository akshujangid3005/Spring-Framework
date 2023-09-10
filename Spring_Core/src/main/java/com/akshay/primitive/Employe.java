package com.akshay.primitive;

public class Employe {
	@Override
	public String toString() {
		return "Employe [id=" + id + ", empName=" + empName + ", address=" + address + "]";
	}
	private String  id ;
	private String empName;
	private String address;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("Setter injection: id ");
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("Setter injection: name ");
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Setter injection: address ");
		this.address = address;
	}
	
	

	
	

}
