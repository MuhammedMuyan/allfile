package com.neotech.lesson06;

import java.util.Scanner;

public class TAsk3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		//Ask user for the first number
		System.out.println("Enter the first number:");
		int firstNumber = input.nextInt();
		
		//Ask user for the second number
		System.out.println("Enter the second number");
		int secondNumber = input.nextInt();
		
		
		//Compare two numbers
		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " is greater then " + secondNumber);
		}
		else if (firstNumber == secondNumber) {
			System.out.println(firstNumber + " is equal to " + secondNumber);
		}
		else {
			System.out.println(firstNumber + " is less than " + secondNumber);
		}
		
		
		
		
	}

}
