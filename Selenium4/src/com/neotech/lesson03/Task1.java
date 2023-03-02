package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get(url);
		

		//*[@id="email"]		
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john123");
		driver.findElement(By.id("email")).sendKeys("paysiz");
		
		
		
		
		//*[@id="pass"]
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("john123");

		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
