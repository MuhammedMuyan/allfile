package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.cheome.driver", "drivers/chromedriver");		
		WebDriver driver = new ChromeDriver();
	
		
		
		
		
		
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.id("email")).sendKeys("ferdi@gmail.com");	
	
	
		driver.findElement(By.name("pass")).sendKeys("Turkme123");
		
		Thread.sleep(1000);
		
		
		
		
		// click on link-> forget password
		driver.findElement(By.linkText("Forget password?")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
	    driver.quit();
	
	
	
	
	
	
	}

}
