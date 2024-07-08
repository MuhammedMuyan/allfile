package lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	
	public final static String url = "https://www.facebook.com/";
	
	
	public static void main(String[] args) throws InterruptedException {

	System.getProperty("webdriver.driver.chrome", "drivers/chromedriver");	
	
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mehmet");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mehmet");
	driver.findElement(By.xpath("//button[@name='login']")).click();

	
	
	Thread.sleep(5000);
	//driver.quit();
	
	
		
		
		
		
	}

}
