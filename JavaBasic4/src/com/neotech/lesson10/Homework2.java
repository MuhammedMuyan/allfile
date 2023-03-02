package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = "muhammed";
		String password ="123456";
		
		String inputname ;
		String inputpassword ;
		
		
		do {
			System.out.println("What is your name and password: ");
			inputname = scan.next();
			inputpassword = scan.next();
			
			if(inputname.equals(name) && inputpassword.equals(password) ) 
			{
				System.out.println("You are log in!");
				break;
			}
		
		} while(name != inputname || password != inputpassword);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
