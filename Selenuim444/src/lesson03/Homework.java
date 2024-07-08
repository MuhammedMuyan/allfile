package lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	
	public final static String url = "https://www.demo.guru99.com/test/newtours/";
	
	
	
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		
		
		
		//Thread.sleep(5000);
		driver.quit();
		
		
		String expectedUrl = "https://www.demo.guru99.com/test/newtours/register_sucess.php";
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Test passes");
		
		}else {
			System.out.println("Test fail");
		}
		
		
		
		
		
	}

}
