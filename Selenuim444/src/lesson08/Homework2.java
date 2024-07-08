package lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		String label = driver.findElement(By.xpath(null)).getText();
		
		WebElement innerFrame = driver.findElement(By.xpath(label));
		driver.switchTo().frame(0);
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
	}



}
