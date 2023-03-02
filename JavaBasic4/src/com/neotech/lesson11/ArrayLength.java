package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		
		
		
		//arrays: collections of same thype of data
		String[] students = new String[5];
		
		
		students[0] = "Fatihcan";
		students[1] = "Oguzzhan";
		students[2] = "Abdullah";
		students[3] = "Oktay";
		students[4] = "Burak";
		
		
		
		// how can we get the length of an array
		int arrayLength = students.length;
		
		System.out.println(arrayLength);
		
		
		//Another way how to declare an array
		
		int[] scores = {90, 86, 94, 88, 80,70};
		
		System.out.println(scores.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
