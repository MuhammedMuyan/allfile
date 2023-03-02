package com.neotech.lesson18;

public class LocalVariable {
	
	void method1() {
		String name = "Gloria";
		int age =28;
		System.out.println(name);
		System.out.println(age);
	
	}
	void method2 () {
		String name = "Mustafa";
		
		System.out.println(name);
		//System.out.println(age);
	}
	
	

	public static void main(String[] args) {
		
		
		LocalVariable obj1 = new LocalVariable();
		obj1.method1();
		obj1.method2();
		
		boolean flag = true;
		if(flag) {
			String answer = "yes";
			System.out.println(answer);
			System.out.println(flag);
		}
		
		System.out.println();
		
		
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("============");
		
		
		int x;
		for(x=1; x<=5; x++) {
			System.out.print(x + " ");
		}
		System.out.println(x + " ");
		
		
		
		
		
		
		
		

	}

}
