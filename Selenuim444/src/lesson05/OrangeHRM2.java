package lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigsReader;
import utils.Constants;

public class OrangeHRM2 {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH); 
		
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
		System.getProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		break;
		
		}
	
		String website = ConfigsReader.getProperty("url");
		driver.get(website);
		
		String title = driver.getTitle();
		System.out.println("title-> " + title);
	
		Thread.sleep(5000);
		driver.quit();
	
	}
	
	
}
