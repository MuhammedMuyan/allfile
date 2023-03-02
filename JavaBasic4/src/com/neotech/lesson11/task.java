package com.neotech.lesson11;

public class task {

	public static void main(String[] args) {
		
		// 1 way
		char[] grades = new char[6];
		
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		
		
		
		// 2 way
		char[] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F' };
		
		System.out.println(grades[1]);
		System.out.println(grades2[1]);
		
		
		
		

	}

}
