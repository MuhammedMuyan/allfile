package Homework;

import java.util.Scanner;

public class week204 {

	public static void main(String[] args) {
		
//		2. You are DMV representative and you need to ask customer their age.
//	    If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is your name: ");
		String name = input.nextLine();
		
		System.out.println("How old are you");
		int age = input.nextInt();
		
		if ( age >= 18) {
			System.out.println("You can apply for driver license!");
		}
	
		else {
			System.out.println("Sorry, you can NOT apply for license!");
		}
		
		
		
		
		
		
		
		
	}

}
