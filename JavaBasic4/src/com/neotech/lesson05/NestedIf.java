package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {
		
		// if it is moorning --> say good moorning
		//if it is a school day - you are not at school
		//else you are at home 
		//else (not moorning) --> good afternoon
		
		
		boolean isMoorning = true;
		boolean isSchoolday = false;
		
		if (isMoorning) {
			
			System.out.println("Good Morning");
			
			if (isSchoolday) {
				System.out.println("You are At school!");
			}
			
			else {
				System.out.println("You are at home!");
			}
			}
		
		else {
			System.out.println("Good Afternoon");
		}
	
		System.out.println("-----------------------------------------");

		//new task
		
		boolean isFriday = true;
		int date = 15;
		
		if (isFriday) {
			System.out.println("It is Friday. I am going to watch a movie.");
		
			if (date == 13) {
				System.out.println("I will watch a scary movie.");
			}
			else if ( date == 15) {
				System.out.println("I will watch thriller.");
			}			
			
			else {
				System.out.println("I will watch a comedy.");
			}
		
		}
		else {
			System.out.println("I will studying java.");
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
