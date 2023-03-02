package review502;

public class CarDemo {

	public static void main(String[] args) {
		
		
		Car c = new Car();
		c.make = "Toyata";
		c.model ="camry";
		c.year = 2020;
		
		c.printDetails();
		
		//with parametrized constructor
		Car c2 = new Car("BMW", "M5", 2021);
		c2.printDetails();
				
				//if we create a parameterized constructor but we dont include a default constructor
				//we are intentionally leaving only one way to create an object
		Car c3 = new Car("MB", "E350", 2021);
		
		

	}

}
