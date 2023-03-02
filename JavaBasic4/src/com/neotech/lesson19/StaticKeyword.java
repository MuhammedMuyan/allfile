package com.neotech.lesson19;

public class StaticKeyword {

	//instance variable
	String  color;
	int memory;
	
	//static variable
	static String brand;
	static boolean touchscreen;
	
	//no static it is instance variable
	void displaySpesificInfo() {
		System.out.println("We built a " + brand + " with " + memory + "GB with " + color + " color!" );
	}
	
	// only static variables
	static void displaySpesificInfo_2() {
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);
	}
	
	
	public static void main (String[] arg) {
		
		// this is a local variable we have to distinguish from the others
		
	brand = "Iphone";
	StaticKeyword.touchscreen =true;
	
	
	StaticKeyword iphone1 = new StaticKeyword();
	iphone1.memory = 64;
	iphone1.color = "red";
	
	
	iphone1.displaySpesificInfo();
	
	
	StaticKeyword.displaySpesificInfo_2();

	
	iphone1.touchscreen = false;
	
	StaticKeyword.touchscreen = true;
	
	displaySpesificInfo_2();
	
	
	
	
	}

}
