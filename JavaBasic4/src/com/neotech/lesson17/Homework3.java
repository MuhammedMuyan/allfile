package com.neotech.lesson17;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter fathers name: ");
		String fname = scan.next();
		
		System.out.println("please neter mothers name: ");
		String mname = scan.next();
		
		System.out.println("Are you expecting a boy or a girl? ");
		String baby = scan.next();
		
		
		if(baby.equals("boy")) {
			
			String boyName = fname.substring(0, fname.length()/ 2).concat
					(mname.substring(mname.length()/2));
		
			
		}
		
		
		
		
		
		
		
		

	}

}
