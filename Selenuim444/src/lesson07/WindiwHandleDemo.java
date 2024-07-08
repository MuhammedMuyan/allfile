package lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.BaseClass;

public class WindiwHandleDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		System.out.println("Title is   " + driver.getTitle());
		System.out.println("HAndle  " + driver.getWindowHandle());
		
		
		driver.findElement(By.linkText("Help"));
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("Number of open windows is" + allWindowHandles.size());
		
		Iterator<String> it = allWindowHandles.iterator();
		
		String window1 = it.next();
		String window2 = it.next();
			
		System.out.println("Window1: " + window1);
		System.out.println("WIndow2: " + window2);
		
		
		driver.switchTo().window(window2);
		
		String title2 = driver.getTitle();
		System.out.println("Title is " + title2);
		
		
		
		
				
		tearDown();
	}
}
