package com.neotech.lesson25;

public abstract class Vehicle {

	String color;
	
	Vehicle (String color) {
		this.color = color;
		
	}
	
	public void drive() {
		System.out.println("Vehicle drives!");
	}
	public void stop() {
		System.out.println("Vehicle stops!");
	}
	
	public abstract void start();
	
	public abstract void brake();
	
}


  abstract class Car extends Vehicle {
	  String carType;
	 
	  Car(String color, String carType) {
			super(color);
			this.carType = carType;
	    }
	  public void brake() {
			System.out.println(carType + " have brakes!");

	  
 }
  }
  
  class Tesla extends Car{
	  Tesla(String color, String carType) {
			super(color, carType);
  
	  }

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	class Toyota extends Car {

		Toyota(String color, String carType) {
			super(color, carType);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	

	
  }	
	
	 