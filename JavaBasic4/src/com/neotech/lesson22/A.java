package com.neotech.lesson22;

public class A {

	/*
	 * Write a program for multilevel inheritance where class A is inherited by B and
	 * class B is inherited by class by C.
	 */
	
	String name = "A";
	
	void method() {
		System.out.println("This is a method in class A");
		
	}
	
 }
	

	class B extends A {
		
		String name = "B";
		
		void method() {
			System.out.println("This method is class B");
			System.out.println(this.name);
			System.out.println(super.name);
		}
		
		
		
	}
	
	class C extends A {
		
		
		String name = "C";
		
		void method() {
			System.out.println("This method is class C");
			System.out.println(this.name);
			System.out.println(super.name);
			super.method();
		}
	}
	
	

