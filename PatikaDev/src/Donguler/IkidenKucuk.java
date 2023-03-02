package Donguler;

import java.util.Scanner;

public class IkidenKucuk {

	public static void main(String[] args) {
		
		
		int n;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		n = scan.nextInt();
				
		
		for( int i = 1; i<=n; i*=2) {
			
			System.out.println(i);
			sum+=i;
			
			
			
		}
		
		System.out.println("total: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
