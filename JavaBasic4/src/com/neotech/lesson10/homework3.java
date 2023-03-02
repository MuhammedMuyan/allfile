package com.neotech.lesson10;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		/*
		  int i = 1;

		while (i < 50) {

			if (i % 3 == 0) {
				
				i++;
				continue;

			} else {
				System.out.print(i + " ");
			}

			i++;
		}
                          */
	
	
	
	
		
		/*int i = 1;
				
		do {
			if ( i % 3 == 0) {
				i++;
				continue;
			}
			
		System.out.print(i + " ");
		i++;
		
		} while (i<=50);
	
	            */
	
	
	
		for(int i = 1; i<=50; i++) {
			
			if(i% 3 == 0) {
				continue;
			}
		
			System.out.print(i + " ");
			
		}
	
		
		
		
		
		
		
		
		
		

	}

}
