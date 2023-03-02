package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();

	
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Black";
		car1.year =2019;
		car1.mileage = 25000;
		car1.maxSpeed =200;
		
		System.out.println(car1.make +  " " + car1.model + " " + car1.color +
				" " + car1.year + " " + car1.mileage + " " + car1.maxSpeed);
	
	
		car1.drive();
		car1.stop();
		car1.transportPeople();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
