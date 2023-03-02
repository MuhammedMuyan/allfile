package Homework;

import java.util.Scanner;

public class week206 {

	public static void main(String[] args) {
		
// Allow user to enter grade and then provide explanation:
//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end
//your program should print which grade was entered by a user with explanation.
		
		
		Scanner scanner = new Scanner(System.in);

		String grade;

		System.out.println("What is your grade:");
		grade = scanner.next();
		
		
		
		switch (grade) {
		 
		case "A":
			System.out.println("Excellent");
			break;
			
		case "B": 
			System.out.println("Good");
			break;
		
		
		case "C": 
			System.out.println("Avarage");
			break;
		
		
		case "D": 
			System.out.println("Bad");
			break;
		
		
		default:
			System.out.println("Not acceptable");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
