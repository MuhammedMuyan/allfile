package Homework;

import java.util.Scanner;

public class week205 {

	public static void main(String[] args) {
		
//		3. Create a Java program that will ask user to input city and temperature.
//	    Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Which city are you living: ");
		String city = input.next();
		
		
		System.out.println("What is temperature: ");
		double temperatureF = input.nextDouble();
		double temperatureC = (temperatureF - 32) * 5/9;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
