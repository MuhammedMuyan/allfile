package com.neotech.review03;

public class TwoDArrayintro {

	public static void main(String[] args) {
		
		
		int [][] nums = {
				{6,3,7},
				{2,4,9},
				{1,5,-4},
				{8,6,2}
			
		};
		
		for(int[] row : nums) {
			
			for(int element:row) {
				System.out.print(element + " ");
			}
		System.out.println();
		}
		
		System.out.println("================================");
		
		
		for(int row=0; row<nums.length; row++) {
			
			for(int column=0; column < nums[row].length; column++) {
				
				System.out.print(nums[row][column] + " ");
			}
		
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
