package com.akshay;

public class Ritik implements Action {
	public Ritik() {
		System.out.println("Ritik object is created ");
	}

	@Override
	public void eat() {
		System.out.println("Ritik is eating ");
		
		
	}

	@Override
	public void sleep() {
		System.out.println("Ritik is Sleeping ");
		
	}

	@Override
	public void run() {
		System.out.println("Ritik is running ");
		
	}

}
