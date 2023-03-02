package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		
		/*   example
		 *  1
		 *  12
		 *  123
		    1234
			123
			12
			1
		*/
		
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			
			
			for( int j= 1; j <= i; j++) {
				
				
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}
		
		
		for( int i = num -1; i >= 1; i--) {
			
			
			for(int j=1; j<= i; j++) {
				System.out.print(j + " ");
			
		}
		
			System.out.println();
		
		}
		
		
		
		
		
		
		
		

	}

}
