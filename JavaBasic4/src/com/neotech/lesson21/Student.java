package com.neotech.lesson21;

public class Student {

	String name, address;
	
	//constructor methid to for initialization
	public Student() {
		
	}
	//2.constructor method
	public Student( String name, String address) {
		this.name = name;
		this.address =address;
		
	}
	
	//3. constructor method
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Name --> " +this.name + " Address --> " + this.address);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
