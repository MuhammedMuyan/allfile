package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.cheome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// 1. way
		// driver.get("https://www.facebook.com");
		// will not store history
		// wait for the page elements to be loaded
		
		
		// 2. way		
		driver.navigate().to("https://www.facebook.com");
		// saves the history
		//does not wait the page to be full loaded
		
		
		//driver.manage().window().maximize();
		// make secreen full screen
		
		// driver.manage().window().fullscreen(); 
		// open with full screen
		
		//driver.navigate().refresh();
		//make page refresh
		
		driver.navigate().to("https://www.amazon.com");  
		Thread.sleep(2000);
		
		
		driver.navigate().back(); // bring us back to facebook
		Thread.sleep(2000);
		
		
		driver.navigate().forward(); // bring us forward to amazon
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
