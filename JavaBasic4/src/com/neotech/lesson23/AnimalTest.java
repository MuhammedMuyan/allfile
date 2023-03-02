package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {
		
       Animal obj1 = new Animal();
       obj1.eat();
       obj1.sleep();
       
       
       
       Tiger obj2 = new Tiger();
       obj2.eat();
       obj2.run();
       
       System.out.println("-------------------");
       //casting
       int i = 3;
       double d = i;
       
       Animal obj3 = new Tiger();
       obj3.eat();
       obj3.sleep();
       
       
       
       
       
       
      
       
       
	}

}
