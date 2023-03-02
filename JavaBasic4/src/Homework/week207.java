package Homework;

import java.util.Scanner;

public class week207 {

	public static void main(String[] args) {
		
		

  /*Using scanner class to create a calculator. Allow user to enter 2 numbers
  and operator(+,-,*,/). Based on operator provide the result to user.
	*/	
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		System.out.println("Enter your two number");
		num1 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		num2 = scanner.nextInt();
		
		
		switch(operator) {
		
		case '+' :
			System.out.println(num1 + num2);
			break;
			
		case '-' :
			System.out.println(num1 - num2);
			break;
		
		case '/' :
		    System.out.println(num1 / num2);
			break;
		
		case '*' :
		    System.out.println(num1 * num2);
			break;
		
		default :
			System.out.println("Invalid entry");
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
