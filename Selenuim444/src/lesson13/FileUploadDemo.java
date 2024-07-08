package lesson13;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class FileUploadDemo extends CommonMethods {

	public static void main(String[] args) {

		// https://the-internet.herokuapp.com/upload
		
		
		setUp();
		
		click(driver.findElement(By.linkText("File Upload")));
		
		String filePath = System.getProperty("user.dir") 
				+ "/screenshots/Lesson13/Homework2.png";
		
		sendText(driver.findElement(By.id("file-upload")), filePath);
		
		wait(2);
		
		
		click(driver.findElement(By.id("file-submit")));
		
		wait(2);
		
		
		
		tearDown();
		
	}

}
