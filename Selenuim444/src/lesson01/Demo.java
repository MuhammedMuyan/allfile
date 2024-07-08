package lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.neotechacademy.com/");
		
		Thread.sleep(5);
		driver.quit();
		
		
		
		
		
		
	}

}
