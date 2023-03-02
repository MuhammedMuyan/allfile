package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homewrk {

	public static void main(String[] args) {
		
		
		 
		    // Set the path of the Chrome driver to the location of the downloaded driver on your computer
		    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

		    // Create a new instance of the Chrome driver
		    WebDriver driver = new ChromeDriver();

		    // Navigate to the Amazon homepage
		    driver.get("https://www.amazon.com/");

		    // Get the page title and store it in a variable
		    String pageTitle = driver.getTitle();

		    // Verify that the page title is "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
		    if (pageTitle.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
		      System.out.println("Page title is correct");
		    } else {
		      System.out.println("Page title is incorrect");
		    }

		    // End the session (close the browser)
		    driver.quit();
		  
		

		
		
		

	}

}
