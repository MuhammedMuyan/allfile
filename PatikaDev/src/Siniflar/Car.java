package Siniflar;

public class Car {
	
	String type;
	String model = "Test";
	String color;
	int speed;
	int speedLimit = 180;
	
	
	Car(String model, int speed) {
		this.model = model;
		System.out.println(this.model);
	}
	
	
	void increasSpeed(int increment) {
		int  a = 5;
		if ( (speed + increment) < speedLimit) {
			speed += increment;
		}
		
	}
	
	void decreaseSpeed(int decrease) {
		
		if (speed > 0) {
			speed -= decrease;
		}
	}
	
	void printSpeed() {
		System.out.println("Hiziniz: " + speed);
	}
	
	
	
	

}
