package lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCssSelectorDemo {

	public final static String url = "https://www.facebook.com/";	
	
	
	public static void main(String[] args) {

		System.getProperty("webdriver.driver.chrome", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("ssada");
		
		
		
	}

}
