package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		
		//Data type name assigment operator (=) values ;
		
		//class name    = new Class name
		Scanner scanner = new Scanner(System.in);
		
		String text1, text2, text3;
		int age, year;
		double salary;
		boolean isRainig;
		char gender;
		
		
		
		
		
//		System.out.println("Enter a sentence");
//		text1 = scanner.nextLine();
//		System.out.println(text1);
//		
//		text2 = scanner.next();
//		System.out.println(text2);
//		
//		text3 = scanner.nextLine();
//		System.out.println(text3);
		
		
//		System.out.println("What is your age:");
//		age = scanner.nextInt();
//		System.out.println("What year is it:");
//		year = scanner.nextInt();
//		System.out.println("You are " + age + " and you borned in " + year + " ! ");

		
		
//		System.out.println("Enter your gender (M or F): ");
//		gender = scanner.next().charAt(0);
//		System.out.println(gender);
//		
		
		
		
		System.out.println("Enter your name, city, age, gender, and salary:");
		
		text1 = scanner.next();
		text2 = scanner.nextLine();
		text3 = scanner.next();
		age = scanner.nextInt();
		gender = scanner.next().charAt(0);
		salary = scanner.nextDouble();
		
		System.out.println(text1 + " " + text2 + " " + text3 + " " + age + " " + gender + " " + salary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
