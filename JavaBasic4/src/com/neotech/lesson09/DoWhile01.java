package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		int num = 5;
		boolean correctNum = true;
				
		while (correctNum) {
			
			System.out.println("Enter number: ");
			num = scan.nextInt();
		
			if(num == 5) {
				System.out.println("True");
				correctNum = false;
				
			}
		
			else {
				System.out.println("Please try again!");
			}
		
			
		}
		
		System.out.println("You are the winner!");
		
	*/
	
	
		int luckyNumber = 5;
		
		int number;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter number: ");
		number = scan.nextInt();
		
		while (number != luckyNumber) {
			System.out.println("Enter number: ");
			number = scan.nextInt();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
