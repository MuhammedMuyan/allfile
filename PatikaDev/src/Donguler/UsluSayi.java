package Donguler;

import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		System.out.println("Us olcak sayi: ");
		int us = scan.nextInt();
		int total = 1;
		
		int i = 1;
		
		while(i<=us) {
		
			total*=num;
			i++;
		}
		
			System.out.println(total);
	}

}
