package com.neotech.lesson21;

public class Constructors {

	
	//1st
	Constructors () {
		this(5);
		
	}
	
	//2nd
	Constructors (int x) {
		this(2,4);
		System.out.println("Hello 2nd constructor");
	}
	
	
	//3rd 
	Constructors (int x, int y) {
		System.out.println("Hello 3rd constructor");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Constructors obj1 = new Constructors(3,5);
		
		Constructors obj2 = new Constructors(6);
		
		
		
		
		
		
		
		
		
		
		
	}

}
