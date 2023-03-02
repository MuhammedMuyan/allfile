package com.neotech.review04;

public class World {

	public static void main(String[] args) {
		
		//Declaring and initialization a variable
		
		Baby baby1 = new Baby();
		baby1.name = "Pedro";
		baby1.weight = 18;
		
		System.out.println("The name of baby1 is " + baby1.name);
		System.out.println("The hair color of babyy is " + baby1.hairColor);
		
		baby1.hairColor = "Black";
		baby1.gender = 'M';
		System.out.println("The hair color of baby1 is " + baby1.hairColor);
		
		
		System.out.println("=============================");
		
		
		
		//Declaring a variable of type baby		
		Baby baby2;
		baby2 = new Baby();
		
		baby2.name = "Aykut";
		baby2.gender = 'M';
		baby2.hairColor = "Red";
		baby2.weight = 5;
		
		System.out.println("The hair color of baby1 is " + baby2.hairColor);
		
		
		
		baby2.cry();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
