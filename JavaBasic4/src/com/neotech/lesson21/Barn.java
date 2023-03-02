package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.size = "Big";
		a.color = "Brown";
		a.age = 5;
		
		a.sleep();
		a.eat();
		a.displayInfo();
		
		System.out.println("----------------");
		Dog d = new Dog();
		d.size = "Medium"; // coming from Animal
		d.age = 2; // coming from Animal
		d.color = "White"; // coming from Animal
		d.breed = "Husky"; // specific to Dog object
		

		d.eat(); // coming from Animal
		d.sleep(); // coming from Animal
		d.displayInfo(); // coming from Animal
		d.bark(); // specific to Dog object
		
		
		
		System.out.println("----------------");
		Cat c = new Cat();
		c.size = "Small";
		c.age = 1;
		c.color = "Gray";
		c.weight = 15;

		c.eat();
		c.sleep();
		c.displayInfo();
		c.meow();
		
		
		
		System.out.println("----------------");
		Puppy p = new Puppy();
		p.size = "Tiny"; // coming from Animal
		p.age = 1;// coming from Animal
		p.breed = "Jack Russell"; // coming from Dog
		p.hasPoppyTraining = false; // this belong to Puppy
		
		
		
		
		
		
		
		
		
		
		
	}

}
