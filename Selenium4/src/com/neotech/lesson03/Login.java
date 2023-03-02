package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public final static String url = "http://sis.neotechacademy.com:9000/Test/";
	
	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chromedriver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		//send username and passwoed and then click on submit
		
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech123");
		
		driver.findElement(By.id("bLogin")).click();
		
		
		Thread.sleep(2000);		
		
		driver.findElement(By.linkText("Students")).click();
		
		
		driver.quit();
		

	}

}
