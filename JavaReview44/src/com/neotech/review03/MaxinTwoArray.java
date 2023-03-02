package com.neotech.review03;

public class MaxinTwoArray {

	public static void main(String[] args) {
		
		
		
		
		// Task: Find the biggest number in a 2D Array
				int[][] b = { 
						{ -2, 3, 5 }, 
						{ 2, 4, 9 }, 
						{ 8, 1, -9 }, 
						{ 3, 5, 1 } 
				};
			
		int biggest = b[0][0];
		
		
		for(int row=0; row<b.length; row++) {
			
			for(int column=0; column<b[row].length; column++) {
				
				int element = b[row][column];
				
				if(element > biggest) {
				
					biggest=element;
				}
				
			}
			
		}
		
		System.out.println(biggest);
		
		System.out.println("====================================");
		
		
		int max = b[0][0];
		
		for(int[] row : b) {
			
			for(int element : row) {
				if (element > max) {
					max=element;
				}
			}
			
		}
		System.out.println(max);
		
		
		
		
		
		
		
		
		

	}

}
