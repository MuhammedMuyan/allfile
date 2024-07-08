package lesson12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;
import utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		
		sendText(driver.findElement(By.id("txtUsername"))
				,ConfigsReader.getProperty("username"));
		
		sendText(driver.findElement(By.id("txtPassword"))
				,ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
		
		wait(4);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver; //
		
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRM/screenshot01.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		tearDown();
		
	}

}
