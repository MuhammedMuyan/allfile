package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
		

		/*
		 * Create a 2D array of integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */
		
		int[][] n = {
				{3, 4, 5},
				{10, 11, 12},
				{7, 8, 9}
					};
		
		
		int sum = 0;
		
		for(int row=0; row<n.length; row++) {
			
			for(int col=0; col<n[row].length; col++) {
				
				sum+=n[row][col];
				
			}
		
				System.out.println(sum);
		}
		
		System.out.println("==============================");
		
		int sum2 = 0;
		
		for(int[] m : n) {
			for(int el : m) {
				sum2+=el;
			}
			System.out.println(sum2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
