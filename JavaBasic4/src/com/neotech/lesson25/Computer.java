package com.neotech.lesson25;

public class Computer {

	String brand;
	
	public Computer(String brand) {
		this.brand = brand ;
	}
	
	
}


 class Apple extends Computer {
	public Apple(String brand) {
		super(brand);
	}
	
	
	public void run() {
		System.out.println(brand + " computer runs fasters!");
	}

	public void safe() {
		System.out.println(brand + " is very safe!");
	}
 
 }
 
 
 
 class Lenovo extends Computer {
	 
	 public Lenovo(String brand) {
		 super(brand);
	 }
 }
 class HP extends Computer {
	 String color;
	 HP(String brand, String color) {
			super(brand);
			this.color = color;
 }
 class Dell extends Computer {
	 public Dell(String brand) { 
			super(brand);
 }
 
	 }}