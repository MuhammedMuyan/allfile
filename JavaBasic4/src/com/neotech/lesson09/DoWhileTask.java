package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		
		
		
		int luckyNumber = 5;
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		/*
		System.out.println("Guess the number");
		number = scan.nextInt();
		
		
			while ( number != luckyNumber ) {
				
				System.out.println("Guess my number: ");
				number = scan.nextInt();
			}
		
		*/
		
		
		
		
		do {
			
			System.out.println("Guess my number: ");
			number = scan.nextInt();
			
			
			
		} while( number != luckyNumber);
		
		System.out.println("You are the winner!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
