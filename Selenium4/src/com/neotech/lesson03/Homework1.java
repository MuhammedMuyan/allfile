package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	//url is not changing
	public final static String url = "https://demo.guru99.com/test/newtours/";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Open chrome browser Go to "https://demo.guru99.com/test/newtours/" 
		 * Click on Register Link 
		 * Fill out ALL required info 
		 * Click Submit 
		 * User successfully registered (Create the script using different locators)
		 */
		
		
		System.setProperty("webdriver.chromedriver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		// click on the register link
		
		WebElement register = driver.findElement(By.partialLinkText("REGIS"));
		register.click();
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("333-444-5555");
		driver.findElement(By.name("email")).sendKeys("john123");
		driver.findElement(By.name("password")).sendKeys("john123");
		driver.findElement(By.name("confirmPassword")).sendKeys("john123");
		
		Thread.sleep(2000);
		
		// check if we registered
		
		driver.findElement(By.name("submit")).click();
		
		
		String expectedUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
		
		
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Testes passed");
		}else {
			System.out.println("Test failed");
		}
		
		driver.quit();
		
		

	}

}
