package com.neotech.lesson17;

public class Homework2 {

	public static void main(String[] args) {
		
		
		String str = "hello123456@#$%%^&&";
		
		
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(str);
		System.out.println("How many character " + str2.length());
		
		

	}

}
