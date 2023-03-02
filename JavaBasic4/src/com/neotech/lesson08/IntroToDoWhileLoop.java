package com.neotech.lesson08;

public class IntroToDoWhileLoop {

	public static void main(String[] args) {

//		int num1 = 5;
//		
//		
//		while (num1 >= 15) {
//			
//			System.out.println(num1 + " ");
//			
//			
//			num1++;
//		
//		}	
//		
//		

		int day = 1;
		boolean workDay = true;

		while (workDay) {
			
			if (day < 6) {
				System.out.println("I need a day off!");
				
			}
			else {
				System.out.println("I do not need a day off anymore!");
				workDay = false;
			}
			
			day++;
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
			}}