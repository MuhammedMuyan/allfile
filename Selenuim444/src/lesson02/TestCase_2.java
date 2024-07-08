package lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Mertcan");
		driver.findElement(By.name("lastName")).sendKeys("Sensoy");
		driver.findElement(By.name("phone")).sendKeys("555671111");
		driver.findElement(By.name("userName")).sendKeys("Mertcan123");

		
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
}
