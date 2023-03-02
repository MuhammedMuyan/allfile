package com.neotech.lesson10;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		
		//create a program asking credir number  10 times
		
		
		
		Scanner scan = new Scanner(System.in);
		String input ;
		
		
		for(int i = 1; i<10; i++) {
			
			System.out.println("Do you want to apply: ");
			input = scan.next();
			
			if(input.equals("yes") || input.equals("Yes") ) {
				System.out.println("Perfect good choice!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
