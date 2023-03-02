package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1Homework1 {

	
	
	public static void main(String[] args) {
		
	/*	HW1: Amazon Page Title Verification: 
		Open chrome browser
		Go to “https://www.amazon.com/”
		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		End the Session (close the browser).
	*/
		
		
		System.setProperty("webdriver.chromedriver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String expectedTitle = "Amazon.com";
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Expected title -> " +  expectedTitle);
		System.out.println("Actual title " + actualTitle);
		
		
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Test passsed!");
		
		}else {
			System.out.println("Test Failed");
		}
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
