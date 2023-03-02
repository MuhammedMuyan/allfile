package com.neotech.lesson07;

public class LogicalNot {

	public static void main(String[] args) {
		
		
		// ! (NOT) - reserves the value of a boolean variable
		
		boolean b1 = !true;
		System.out.println(b1);
		
		
		boolean b2 = false;
		System.out.println(b2);
		
		//not only in front of bolean variables, it can woek with any boolean expression
		
		System.out.println(!(6<5));
		
		
		boolean cold = false;
		
		if (!cold) {
			System.out.println("It is cold!");
		}
		
		
		int x = 12;
		
		if (x == 12) {
			System.out.println("x is 12");
		}
		
		else {
			System.out.println("x is NOT 12");
		}
		
		
		// we can write like this!
		// != is opposite of ==
		
		
		if ( x != 12) {
			System.out.println("x in NOt 12");
		}
		
		
		
		
		
		
		
		

	}

}
