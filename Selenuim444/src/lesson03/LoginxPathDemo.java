package lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginxPathDemo {

	public final static String url = "https://sis.neotechacademy.com/";
	
	public static void main(String[] args) {

		System.getProperty("webdriver.driver.chrome", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");
		driver.findElement(By.xpath("//input[@name='bLogin']")).click();
		
		
		
		
		
		
		
		
	}

}
