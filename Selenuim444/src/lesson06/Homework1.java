package lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;
import utils.ConfigsReader;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		String userName = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");
		
		
		WebElement userNameBox = driver.findElement(By.xpath("//input[@name='txtUsername']")); 
		WebElement passwordBox = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userNameBox.sendKeys(userName);
		passwordBox.sendKeys(password);
		loginBtn.click();
		
		
		String expected = "Jacqueline White";
		String actual = driver.findElement(By.id("account-name")).getText();
		
		if(expected.equals(actual)) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test Fail!");
		}
		
		
		
		
		Thread.sleep(5000);
		tearDown();
	
		
	}
	
	
	
	
	
}
