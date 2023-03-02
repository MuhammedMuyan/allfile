package com.neotech.lesson22;

public class Car {

	String make,model;
	
	
	
	// car class constructor
	Car() {
		System.out.println("Car default Constructor");
	}
	
	Car(String make, String Model) {
		this.make = make;
		this.model =model;
		
	}
	
	void driving() {
		System.out.println("Car is driving");
	}
	
	
}
