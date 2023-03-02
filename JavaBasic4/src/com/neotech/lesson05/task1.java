package com.neotech.lesson05;

public class task1 {

	public static void main(String[] args) {
		
		int day = 6;
		
		//if day is == 1 ===> Today is Monday and we are working
		//2. if day == 2
		//3. if day == 3
		// ....
		
		if (day == 1) {
			System.out.println(" Today is Monday and we are working! ");
		}
		else if (day == 2) {
			System.out.println(" Today is Tuesday and we are working! ");
		}
		else if (day == 3) {
			System.out.println(" Today is Wednesday and we are working! ");
		}
	
		else if (day == 4) {
			System.out.println(" Today is Thursday and we are working! ");
		}
		
		else if (day == 5) {
			System.out.println(" Today is Friday and we are working! ");
		}
	
		else {
			System.out.println(" Today is weekend and we are NOT working! ");
		}
	
	
		System.out.println("------------------------------------------------");
	
	
			if ( day < 6) {
				System.out.println(" Today is Weekday and we are working! ");
			}
	
			else if (day > 5) {
				System.out.println(" Today is weekend and we are on holiday! ");
			}
			
			else {
				System.out.println(" Wrong Input ");
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
