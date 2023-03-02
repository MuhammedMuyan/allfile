package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.geckodriver" ,  "drivers/chromedriver");
		
		WebDriver driver = new  FirefoxDriver();
		
	
		String url = "https://www.redfin.com";
		
		driver.get("https://www.redfin.com");
		
		//
		driver.get(url);
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
