package com.neotech.lesson03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static String url = "https://sis.neotechacademy.com:9000/Test/";
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		
		
		
	}

}
