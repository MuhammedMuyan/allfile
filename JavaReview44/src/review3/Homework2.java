package review3;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		/*
		 * Ask the user to enter an integer and build the following pattern: 
		 * Hint: Use scanner, if user entered number 5, there should be two parts 
		 * The first part,
		 * 1 to 5 The second part, 4 to 1
		 * 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */
	
	/*
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");   
		int num = scan.nextInt();
	
		
		for(int i =1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			
			
			System.out.println();
		}
	
		
		        //print the bottom pattern 
				//1 2 3 4
				//1 2 3
				//1 2
				//1
		
		
		
		
		for(int i = num-1; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
		
				System.out.println();
		}
	*/
	
	
	
	
	   Scanner scan = new Scanner(System.in);
	   System.out.println("enter number");
	   int num = scan.nextInt();
	   
	   
	   for(int i = 1; i<=num; i++) {
		   
		   for(int j=1; j<=i; j++) {
			   
			   System.out.print(j);
		   }
	   
		   	 System.out.println();
	   }
		
		
		for(int i=num-1; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
		
				System.out.println();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

}
