package Homework;

import java.util.Scanner;

public class weeek202 {

	public static void main(String[] args) {
		
//		2. Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
//		If any day from 1-5 → output “It is a weekday”
//		Any day from 6-7 → output “It is a weekend”,
//		Any other day → output “Invalid day”
		

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your number please: ");
		int num = input.nextInt();
		
		if (num < 6 && num >= 1) {
			System.out.println("It is weekday.");
		}
		else if (num >=6 && num <= 7) {
			System.out.println("It is weekend.");
		}
		else {
			System.out.println("Invalid day.");
		}
		
		
		
		
		
		
	}

}
