package lesson07;

import java.util.Set;

import org.openqa.selenium.By;

import utils.BaseClass;

public class WindowHandlePractice extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		System.out.println("Title is: " + driver.getTitle());
		
		String mainPageId = driver.getWindowHandle();
		System.out.println("The main page is: " + mainPageId);
		
		
		driver.findElement(By.id("tabButton")).click();
		
		//2. window
		driver.findElement(By.id("windowButton")).click();
		
		//3. window
		driver.findElement(By.id("messageWindowButton")).click();
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Number of wndows: " + allWindowHandles.size());
		
		
		for(String handle : allWindowHandles) {
			if(!handle.equals(mainPageId)) {
				
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		
		
		
		
		
		
		tearDown();
		
	}

}
