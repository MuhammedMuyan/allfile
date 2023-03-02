package com.neotech.lesson19;

public class Employee {

	public static String company;
	public String name;
	protected String lastName;
	double salary;
	private int ssn;
	
	public void method1() {
		System.out.println("I am a public method");
	}
	protected void method2() {
		System.out.println("I am a protected method");
	}
	void method3() {
		System.out.println("I am a default meethod");
	}
	private void method4() {
		System.out.println("I am a private void method");
	}
	

	
	public static void main(String[] arg) {
		
	
		Employee emp = new Employee();
		emp.name ="Sabah";
		emp.lastName = "Bushaj";
		emp.salary = 122345;
		emp.ssn = 12345;
	
	
	emp.method1();
	emp.method2();
	emp.method3();
	emp.method4();
	
	
	
	
	
	}
	
	
	
	
}
