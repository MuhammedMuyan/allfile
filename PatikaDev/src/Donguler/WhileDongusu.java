package Donguler;

import java.util.Scanner;

public class WhileDongusu {

	public static void main(String[] args) {
		
		
//		int i = 1;
//		int k;
//		
//		System.out.println("Program basladi");
//		
//		
//		while ( i <= 5) {
//			System.out.println(i);
//			i++;
//			k = 1;
//			
//			while (k <= 10) {
//				System.out.println(k + ",");
//				k++;
//			}
//			
//			System.out.println();
//		}
//		
//		
//		System.out.println("Program bitti1");
		
		
		
		//ikinci kullanim yolu
//		int left = 100 , right = 200;
//		
//		while (++left < --right);
//		
//		System.out.println(left);
//		
		
		
//		int password;
//		boolean isPasswordSucces = true;
//		
//		
//		Scanner input = new Scanner (System.in);
//		
//		
//		
//		 
//		
//		while (isPasswordSucces) {
//			
//			System.out.println("Enter your password: ");
//			password = input.nextInt(); 
//			
//			
//			if (password == 123) {
//				 System.out.println("Password is correct!");
//				 isPasswordSucces = false;
//			}
//			 else {
//				 System.out.println("Password uncorrect!");
//				 
//			 }
//		}
		

		
		
//		int i = 1;
//		int k;
//		
//		
//		while ( i <= 10) {
//			System.out.println(i);
//			i++;
//		
//			k = 1;
//			while (k<= 10) {
//				System.out.print(k + ",");
//				k++;
//			}
//		}
//		
		
		
		
		
		int password;
		Scanner input = new Scanner(System.in);
		
		boolean isPasswordSuccess = false; //true yaparsan while oraya false yazman llazim
		
		
		
		
		while (!isPasswordSuccess) {
			
			System.out.println("Enter password: ");
			password = input.nextInt();
			
			
			if ( password == 123) {
				System.out.println("Password is correct!");
				isPasswordSuccess = true; // yukari true yazarsan buraya false yazman lazim
				
			}
			else {
				System.out.println("Password is UNCORRECT!");
			}
		
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
