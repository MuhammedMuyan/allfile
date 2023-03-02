package Homework;

import java.util.Scanner;

public class week02 {

	public static void main(String[] args) {

//		1. Ask the user to enter the height in inches. Person should be classified as one of the following:
//			• short (under 60 inch)
//			• medium (between 60 -72 inch)
//			• tall (over 72 inch)

		Scanner input = new Scanner(System.in);

		
		System.out.println("What is your height: ");
		double height = input.nextDouble();

		if (height < 6.0) {
			System.out.println("You are short!");
		} else if (height >= 6.0) {
			System.out.println("You are medium!");
		}

		else {
			System.out.println("You are tall!");
		}

	
	
	
	
	
	
	
	
	
	
	
	
	}

}
