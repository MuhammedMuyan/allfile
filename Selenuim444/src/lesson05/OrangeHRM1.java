package lesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {

	//public final static String url = "https://hrm.neotechacademy.com/";
	
	public static void main(String[] args) throws InterruptedException, IOException {

	/*System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get(url);
		
	WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	username.sendKeys("Admin");
		
	WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	password.sendKeys("Neotech@123");
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	
	
		
		Thread.sleep(5000);
		driver.quit();
		*/
		
		
	// file ile yapilan yol
		
		
	//String filePath = "/Users/muhammedmuyan/eclipse-workspace/Selenuim4/configs/configuration.properties";
		
		String filepath = System.getProperty("user.dir") + "/configs/configuration.properties";
				
		
		FileInputStream fis = new FileInputStream(filepath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
	
		WebDriver driver = null;
		
		if(prop.getProperty("browser").equals("chrome")) {
			//open chrome browser
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();	
		
		System.out.println("open chrome");
		
		}else if(prop.getProperty("filePath").equals("firefox")) {
			
		}
		
		String website =prop.getProperty("url");
		driver.get(website);
		
		String title = driver.getTitle();
		System.out.println("title is: " + title);
		
		
		Thread.sleep(5000);
		driver.quit();
	
		
		
		
		
		
		
		
		
	}

	

}
