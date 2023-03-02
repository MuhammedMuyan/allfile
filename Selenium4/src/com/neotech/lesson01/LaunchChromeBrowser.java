package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.neotechacademy.com");
		
		
		String url = driver.getCurrentUrl();
		System.out.println("url: " + url);
		
		
		String title = driver.getTitle();
		System.out.println("title: " + title );
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
