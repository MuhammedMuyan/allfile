package com.neotech.lesson17;

public class StringToCharArray {

	public static void main(String[] args) {
		        
		
		String sentence ="Today is Tuesday and we are learning Java! ";

		char[] charArray = sentence.toCharArray();
		
		
		for( char c : charArray) {
			
			System.out.print(c + "-");
		}
		System.out.println();
		
		
		
		
		
		
		

	}

}
