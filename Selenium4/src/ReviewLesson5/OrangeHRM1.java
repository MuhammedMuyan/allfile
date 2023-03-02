package ReviewLesson5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM1 {

	public static void main(String[] args) throws Exception {
//		Open Chrome browser
//		Navigate to https://hrm.neotechacademy.com/
//		Print the title of the page
//		Close the browser
		
		
		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
		
		System.out.println(filePath);
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();		 
		prop.load(fis);
		
		System.out.println(prop);
		
		
		// Starting with Selenium classes and methods
		WebDriver driver = null;
		
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chromedriver", "drivers/chromedriver");
			driver = new ChromeDriver();
			
			
		} else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.geckodriver", "drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		
		
		String website = prop.getProperty("url");
		driver.get(website);
		
		String title = driver.getTitle();
		System.out.println("title -> " + title);
		
		
		
		
		
		Thread.sleep(3000);

		driver.quit();

	}

}
