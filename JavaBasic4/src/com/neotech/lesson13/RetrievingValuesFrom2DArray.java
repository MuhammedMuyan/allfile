package com.neotech.lesson13;

public class RetrievingValuesFrom2DArray {

	public static void main(String[] args) {
		
		
	/*	
		
		String [][] months = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October", "November"}
				
		};
		
		int rows = months.length;
		int cols = months[0].length;
		
		
		for(int row =0; row<rows; row++) {
			
			for(int col = 0; col<months[row].length; col++) {
				System.out.print(months[row][col] + " ");
			}
		
		      System.out.println();
		} */
		
		 System.out.println("==================================");
		
		 
		 int[][] numbers = {
				 			{3,4,6}, 
				            {5,7,3,2,6,8,4,2}, 
				            {8}
				        };
		
		
		 for (int row = 0; row < numbers.length; row++)
			{
		
				for (int col = 0; col < numbers[row].length; col++)
				{
					System.out.print(numbers[row][col] + " ");
				}
				System.out.println();
			}
		
		 System.out.println("==================================");
		
		 
		 
		 String [][] months = {
					{"December", "January", "February"},
					{"March", "April", "May"},
					{"June", "July", "August"},
					{"September", "October", "November"}
					
			};
		 
		 for(int satir=0; satir<months.length; satir++) {
			 
			 for(int sutun = 0; sutun<months[satir].length; sutun++ ) {
				 System.out.print(months[satir][sutun] +  " ");
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

}
