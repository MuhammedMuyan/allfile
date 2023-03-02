package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	boolean goodWithNumbers;
	
	public void teachesMath() {
		System.out.println(fullName + " teaches MATH!");
	}
	
	public static void main(String[] arg) {
		
		MathTeacher mt = new MathTeacher();
		mt.fullName = "Elion el";
		mt.major = "Math";
		mt.goodWithNumbers = true;
		
		mt.teaches();
		mt.teachesMath();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
