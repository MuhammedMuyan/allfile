package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
import utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		
		//sending username
		WebElement userName =  driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		// sending pasword
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		// login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
			
		
		// validate that login is succesfull
		WebElement logo = driver.findElement(By.xpath("ohrm-small-logo"));
		
		if(logo.isDisplayed()) {
			System.out.println("passed!");
		}
		
		
		// wait for 5 second
		wait(5);
		
		tearDown();
		
	}
	
	
}
