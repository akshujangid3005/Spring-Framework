package com.akshay.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employe {
private String  id;
private String name;
private List<String > address;
private Set<String> phno;
private Map<String , String> courses;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public Set<String> getPhno() {
	return phno;
}
public void setPhno(Set<String> phno) {
	this.phno = phno;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", address=" + address + ", phno=" + phno + ", courses=" + courses
			+ "]";
}
					
}
