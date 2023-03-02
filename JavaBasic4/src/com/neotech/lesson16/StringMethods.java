package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {
		
		
		// 1st way we used to create strings
		
		String name = "Oktay"; 
		
		
		// 2nd way to create a string
		String name2 = new String("Dardan");
		
		
		//length
		int size = name.length();
		System.out.println("The size of name is " + size);
		
		
		String school = "Neotech";
		System.out.println("The size of the scjool name is " + school.length());
		
		
		String school2 = "     Neotech     ";
		System.out.println("The size of the scjool name is " + school2.length());
		
		
		
		//tuUpperCase()  toLowerCase()
		String city = "New York";
		
		String lowercaseCity = city.toLowerCase();
		System.out.println(lowercaseCity);		
		
		
		System.out.println(city.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
