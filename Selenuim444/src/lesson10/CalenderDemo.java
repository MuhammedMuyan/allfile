package lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class CalenderDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
		
		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!month.equals("April")) {
			
			driver.findElement(By.xpath("//span[@class='monthSelector']")).click();
			month = driver.findElement(null).getText();
		
		}
		
		List<WebElement> days = driver.findElements(By.xpath("soso"));
		
		for(WebElement day : days) {
			
			String dayNum = day.getText();
			if(dayNum.equals("25")) {
				
				day.click();
				break;
			}
			
		}
		
		
		//return month
		
		
		String returnMonth = driver.findElement(By.xpath(month)).getText();
		
		while(returnMonth.equals("May")){
			
			driver.findElement(By.xpath("sdsd")).click();
			returnMonth = driver.findElement(By.xpath("jhjhj")).getText();
		}
		
		
		List<WebElement> returnDays = driver.findElements(By.xpath(returnMonth));
		
		for(WebElement day : returnDays) {
			
			String dayNum = day.getText();
			if(dayNum.equals("5")) {
				
				day.click();
				break;
				
			}
			
		}
		
		
		
		Thread.sleep(5000);
		tearDown();
	}

}
