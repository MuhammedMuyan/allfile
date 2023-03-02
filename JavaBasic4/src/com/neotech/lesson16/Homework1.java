package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1 {

	
		
		
		String createEmail(String firstName, String lastName, String emailType){
			
		
			String email = firstName + lastName + "@" + emailType + ".com" ;
		
		
		
			return email;
		}
			
			
			
			
		public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
		
			System.out.println("Enter yor name: ");
			String fName = scan.next();
			
			
			System.out.println("Enter yor last name: ");
			String lName = scan.next();
			
			
			System.out.println("Enter yor email type: ");
			String eType = scan.next();
			
			
			
			Homework1 hw =  new Homework1();
			
			
			
			System.out.println();
			
			
			
			
			

	}

}
