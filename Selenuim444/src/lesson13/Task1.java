package lesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {

		
		setUp();
		
		
		String filePath = System.getProperty("user.dir") 
				+ "/screenshots/Lesson13/Homework2.png";
		
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
		wait(2);
		
		
		click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));
		
		//handle alert
		acceptAlert();
		
		
		//take screenshots
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("screenshots/Lesson13/FileUpload.png");
		
		
		
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		tearDown();
		
		
	}

}
