package com.neotech.lesson18;

public class Homework1 {

	public static void main(String[] args) {
		
		
		String str = "Sunday";
		
		 //System.out.println(str.charAt(0));
		
			//1.way
		for (int i = str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}
			System.out.println();
	
	
			
			//2.way			
			char[] charArray = str.toCharArray();
			for(int i = str.length()-1; i>=0; i--) {
				char c = charArray[i];
				System.out.print(c);
			}
			System.out.println();
			
			
			
			//3.way			
			StringBuffer strBuffer = new StringBuffer(str);
			strBuffer.reverse();
			System.out.println(strBuffer);
			
			
			String strUpper = str.toUpperCase();
			System.out.println(strUpper);
			
			
	}

}
