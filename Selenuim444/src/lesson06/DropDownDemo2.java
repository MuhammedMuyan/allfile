package lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class DropDownDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement oldButton = driver.findElement(By.id("oldSelectMenu"));
		Select selDD = new Select(oldButton);
		
		
		
		selDD.selectByIndex(1);
		
		//Thread.sleep(5000);
		tearDown();
			
	}
	
	
	
	
}
