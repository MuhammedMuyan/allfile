package com.neotech.review03;

public class TwoArrayIntro {

	public static void main(String[] args) {
		
		
		
		int [][] nums= {
				{3,6},
				{5,2,9,7},
				{8}
		};
		
		
		
		for(int[] num : nums) {
			
			for(int n:num) {
				
				System.out.print(n + " ");
			}
				System.out.println();
		}
		
		
		System.out.println("=======================");
	
		
		for(int row=0; row<nums.length; row++) {
			
			for(int column=0; column< nums[row].length; column++) {
				
				System.out.print(nums[row][column] + " ");
			}
				System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
