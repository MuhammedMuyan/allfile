package com.neotech.lesson14;

public class Car {



	String make;
	String model;
	String color;
	int year;
	int mileage;
	int maxSpeed;



		void drive() {
		System.out.println(make + " " + " drives!");
	}


		void stop() {
			System.out.println(make + " stops!");
		}

		void transportPeople() {
			System.out.println(make + "  " + model + " can transport people!");
		}

		public static void main(String[] args) {
			
			
			int a = 5;
			int b ;
			
			Car car1 = new Car();
			
			car1.make ="Toyota";
			car1.model= "Camry";
			car1.color= "Red";
			car1.year=2019;
			car1.mileage = 25000;
			car1.maxSpeed = 220;
			
			
			System.out.println(car1.make + " " + car1.model + " " + car1.year);
			
			car1.drive();
			car1.stop();
			car1.transportPeople();
			
			
			
			
			
			
			
			
			
			
			
			
		}

		



}
