package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver; ;
	
	
	
	/**
	 * this method open the browser
	 */
	public static void setUp(){
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.getProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
			
		default:
				throw new RuntimeException("Browser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
	
	}
	
	
	
	public static void tearDown() {
		
		if(driver != null) {
			driver.quit();
		}
		
	}
	
	
	
}
