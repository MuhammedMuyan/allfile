package com.neotech.lesson10;

public class PrintingHours {

	public static void main(String[] args) {
		
		// print the hole combination of hours and mins digital clock
		
		
		for( int hour = 0; hour < 24; hour++) {
			for(int minute = 0; minute < 60; minute++) {
				 {
					//System.out.println(" Hour: " + hour +  " : " + minute);
					
					if( hour<10 && minute<10) {
						System.out.println("0" + hour + " : " + "0" + minute );
					}
					else if( hour >= 10 && minute<10) {
						System.out.println(hour + " : " + "0"+ minute);
					}
					else if(hour <= 10 && minute > 10) {
						System.out.println("0" + hour + " : " + minute );
					}
					else {
						System.out.println(hour +  " : " + minute);
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
