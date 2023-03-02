package Donguler;

import java.util.Scanner;

public class DoWHileDongu {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int pass;
		boolean askPassword = true;
		
		do {
			System.out.println("Enter pass :");
			pass = input.nextInt();
		
			if (pass == 123) {
				System.out.println("True");
				askPassword = false;
			}
			else {
				System.out.println("False");
			}
		
		
		} 
		while (askPassword);
		
		
		
		
		

	}

}
