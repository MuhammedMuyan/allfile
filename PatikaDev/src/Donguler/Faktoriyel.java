package Donguler;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		
		int n;
		int total = 1;
		
			
			System.out.println("Enter number");
			n = scan.nextInt();
			
			
			for(int i = 1; i<=n; i++) {
			
				total*=i;
			}
			
		
		System.out.println("Total: " + total);
		
		
		

	}

}
