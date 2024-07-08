package lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class WebTableDemo  extends BaseClass{

	public static void main(String[] args) {
		
		
		setUp();	
		
		List<WebElement> headerData = driver.findElements(By.xpath(null));
		
		Iterator<WebElement> it = headerData.iterator();
		
		while(it.hasNext()) {
			
			
			String headerText = it.next().getText();
			System.out.println(headerText + "");
		}
		
		
		List<WebElement> rows = driver.findElements(By.xpath(null));
		
	
		
	//	System.out.println("=====================================");
	
	
	
		List<WebElement> rowData = driver.findElements(By.xpath(null));
		
		for(WebElement data : rowData) {
			
			System.out.println(data.getText());
		}
		
		
		
		
		
		
	
	
	
		tearDown();
		
	}
	
}
