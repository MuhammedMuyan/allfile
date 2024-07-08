package lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class NestedFrame extends BaseClass {

	
	public static void main(String[] args) {
		
		setUp();
				
		driver.switchTo().frame("frame1");
		
		
		//switch to child frame
		WebElement childFrame = driver.findElement(By.xpath(null));
		driver.switchTo().frame(childFrame);
		
		
		tearDown();
		
		
	}
	
	
	
}
