package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.name = "Sabah";
		emp.lastName = "Bushaj";
		emp.salary = 21212;
		
	//	emp.ssn = 2345; // it is not visible be cause it is private
		
		emp.method1();
		emp.method2();
		emp.method3();
		//emp.method4();  // -> it is not visible be cause it is private	
		
		
		
		
	}

}
