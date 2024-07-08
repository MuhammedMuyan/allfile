package lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class FrameDemo  extends BaseClass{
	
	
	public static void main (String[] args) {
		
	setUp();	
		
	driver.switchTo().frame(0);
	
	WebElement nameBox = driver.findElement(By.id(null));
	nameBox.sendKeys("");
		
	driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		tearDown();
		
	}
	
	
	
	
	
	
	
	
	

}
