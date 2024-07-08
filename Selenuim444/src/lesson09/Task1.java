package lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement table = driver.findElement(By.xpath(null));
		
		String expected = "Financial Center";
		String actual =table.getText();
		
		if(actual.contains(expected)) {
			
			System.out.println(expected + " is in the table");
			
		}else {
			System.out.println("Test fail");
		}
		
		
		
		List<WebElement> headerData = driver.findElements(By.xpath(actual));
		
		for(WebElement data : headerData ) {
			System.out.println(data.getText() + "");
		}
		
		
		
		
		
		
		
		
		tearDown();
		
	}
	
	
	
	
}
