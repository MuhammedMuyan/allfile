package lesson05;

import utils.BaseClass;

public class orangeHRM3 extends BaseClass {

	public static void main(String[] args) {
	
		setUp();
		
		String title = driver.getTitle();
		System.out.println("title is: " + title);
		
		
		tearDown();
	}
	
	
	
}
