package Homework;

import java.util.Scanner;


public class week203 {

	public static void main(String[] args) {
		
//		1. You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
//	    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How much amount do you want: ");
		int amount = input.nextInt();
		
		if ( amount <= 200000) {
			System.out.println("Your loan is in progress!");
		}
		else {
			System.out.println("We cant give loan for you!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
