package lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("yesilllllll");
		
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
