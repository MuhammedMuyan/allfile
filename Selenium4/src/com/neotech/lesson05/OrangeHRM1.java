package com.neotech.lesson05;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM1 {

	public static void main(String[] args) throws Exception {
		
		
		String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";
		
		//System.out.println(filePath);
		
		
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
		
		WebDriver driver = null;
		
		if(prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webriver.chromedriver" , "drivers/chromedriver");
			driver = new ChromeDriver();
		
		} else if ( prop.getProperty("browser").equals("firefox")) {
			
			System.setProperty("webriver.geckodriver" , "drivers/geckodriver");
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
