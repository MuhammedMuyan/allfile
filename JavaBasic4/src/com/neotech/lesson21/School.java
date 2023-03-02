package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
	
		// 1st constructor method

		Student st1 = new Student();
		st1.displayInfo();
	
		
		st1.name = "Sedat";
		st1.address = "123 Main St";
		st1.displayInfo();
		
		
		System.out.println("--------------------");
		
		
		Student st2 = new Student("Sedat","123 Main St");
		
		st2.name = "Sedat";
		st2.address = "123 Main St";
		st2.displayInfo();
		
		
		
		
		
		
		
		
		
	
	
	}

}
