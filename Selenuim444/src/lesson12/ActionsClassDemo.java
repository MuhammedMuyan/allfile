package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.BaseClass;

public class ActionsClassDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		Actions action = new Actions(driver);
		
		//move to elemnet mouse
		
		action.moveToElement(driver.findElement(By.id(null))).perform();
		
		
		
		
		tearDown();
		
		
		
	}

}
