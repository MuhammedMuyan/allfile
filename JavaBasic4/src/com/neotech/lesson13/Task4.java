package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars : American, German, Korean, Italian. Then retrieve
		 * all values from that array using 2 different loops
		 */
		
		
		
		String[][] cars = {{"Ford", "Tesla", "Chevy"},
				{"MB", "BMW", "Audi"},
				{"Kia", "Hyundai"},
				{"Fiat", "Lambo", "Ferrari"}
				};
		
		
		//using indexed for loop
				for (int row = 0; row < cars.length;row++)
				{
					for (int col = 0; col < cars[row].length; col++)
					{
						System.out.print(cars[row][col] + " ");
					}
					System.out.println();
				}
		
		
		
		System.out.println("+====================================");
		
		
		
		
		for ( String[] c : cars) {
			
			for  ( String car : c) {
				System.out.print(car + " ");
			}
		
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
