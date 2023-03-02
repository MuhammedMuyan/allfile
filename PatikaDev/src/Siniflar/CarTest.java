package Siniflar;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car audi = new Car("Audi",10);
		audi.color = "red" ;
		//audi.speed = 20 ;
		audi.increasSpeed(60);
		
		
		
		audi.printSpeed();
		
		
		
	}

}
