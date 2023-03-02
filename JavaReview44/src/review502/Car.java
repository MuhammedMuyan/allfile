package review502;

public class Car {

	String make, model;
	int year;
	
	
	Car() {
		System.out.println("I am a default");
	}
	
	
	Car(String carMake, String carModel, int carYear)
	{
		System.out.println("We are creating an object with parameters!");
		make = carMake;
		model = carModel;
		year = carYear;
	}
	
	
	void printDetails() {
		System.out.println("I have a " + year + " " + make + " " + model +" and it is great!");
	}
	
	
	
	
	
	
}
