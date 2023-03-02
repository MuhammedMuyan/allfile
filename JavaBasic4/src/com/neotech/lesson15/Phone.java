package com.neotech.lesson15;

public class Phone {
		
		//attributes
		String brand ;
		String color;
		String model;
		int price;
		
		
		//behaviors
		void call() {
			System.out.println(brand + " is calling!");
		}
		
		void text() {
			System.out.println(brand + " is texting! ");
		}
		void navigate() {
			System.out.println(brand + " is navigating!");
		}
		
		
		public static void main(String[] args) {	
		
		
		Phone iphone = new Phone();
			
		iphone.brand = " Apple";
		iphone.color = " Red";
		iphone.model = " 14 pro";	
		iphone.price = 2000;	
			
			
		iphone.call();	
		iphone.text();	
		iphone.navigate();	
		
		System.out.println("===================");
		
		Phone android = new Phone();
			
		android.brand = " Samsung";	
		android.color =	" Black";
		android.model =	" Note 10";
		android.price =	500;
		
		android.call();
		android.text();
		android.navigate();
		
		
		System.out.println("=====================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			

	}

}
