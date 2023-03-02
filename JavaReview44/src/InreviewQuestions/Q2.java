package InreviewQuestions;

public class Q2 {
	   // Write a java program to check whether a given number is prime or not?
	   // prime number is a number that is greater then 1.
       // Number 1 is NOT prime
	   // prime number is divisible only by 1 and itself
	

	public static void main (String [] args) {
	
	/*	
		int number = 4;
		
		boolean prime = true;
		
		if ( number ==  1) {
			prime = false;
		
		} else {
			
			for(int i=2; i<number; i++) {
				
				if(number % i == 0) {
					System.out.println(number + " is divisible by " + i);
					prime = false;
					break;
				
				} else {
					System.out.println(number + " is NOT divisible by " + i );
				}
			}
		
		}
			
		System.out.println("===============================");
		
		System.out.println(number + " is prime " + prime);
		
		*/
		
		
		
		
		
		
	int number = 4;
	
	boolean prime = true;
		
		
		if ( number == 1) {
			prime = false;
		
		} else {
			
			for (int i=2; i<number; i++ ) {
				
				if ( number % i == 0) {
					System.out.println(number + " divisible " + i);
					prime = false;
					break;
					
				} else {
					System.out.println(number + " not divisible " + i);
				}
				
			}
		}
		
		
		System.out.println(number + " is prime " + prime);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	}
