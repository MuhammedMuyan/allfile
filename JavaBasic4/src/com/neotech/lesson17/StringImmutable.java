package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "Hello";
		str.concat(" World!");
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		
		//reassigning but not changing
		str=str.concat(" World!");
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
