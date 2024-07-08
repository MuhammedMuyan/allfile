package lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
		//1. way
		// history can not saved hsitory
	//	driver.get("link");
	//	Thread.sleep(5);
	//	driver.quit();
		
		
		//2. way
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
