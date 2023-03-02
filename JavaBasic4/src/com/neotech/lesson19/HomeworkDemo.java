package com.neotech.lesson19;

public class HomeworkDemo {

	public static void main(String[] args) {
		
		
		Homework1 st1 = new Homework1();
		st1.studentName = "Oktay";
		st1.studentId = 1;
		//increment number of student
		Homework1.numberOfStudent++;
		
		
		
		Homework1 st2 = new Homework1();
		st2.studentName = "Hakan";
		st2.studentId = 2;
		
		Homework1.numberOfStudent++;
		
		System.out.println("The total number of students is " + Homework1.numberOfStudent);
		
		
		
		

	}

}
