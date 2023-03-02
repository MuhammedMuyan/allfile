package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("How many number: ");
		int size = scan.nextInt();
		
		
		
		//declaring array
		int[] array = new int[size];
		
		
		//read numbers and enter them into array
		for(int i = 0; i<size; i++) {
			
			System.out.print("Enter a number: ");
			array[i] = scan.nextInt();
		}
		
		/*
		//print the numbers from array	
		System.out.println("Lets print the number from arrays.");
		
		for(int i = 0; i<array.length; i++ ) {
			
			System.out.print(array[i] + ", ");
		}
		
		System.out.println();
		*/
		
		  
		
		//2 way
		System.out.println("Lets print enhanced for loop");
		
		for(int num : array) {
			
			System.out.print(num + ", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
