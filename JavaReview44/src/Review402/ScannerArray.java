package Review402;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		
		
		
		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many number do you want: ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		
		
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Enter a number");
			array[i] = scan.nextInt();
		}
		
		for(int i =0; i<array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Homework-Practice
				// Print the sum of the numbers in the array
				// 1. Using Normal for loop
				// 2. Using Enhanced/advanced or loop
		
		
		
		
		
		
		

	}

}
