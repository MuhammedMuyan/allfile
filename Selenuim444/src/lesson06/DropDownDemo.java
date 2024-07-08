package lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;
import utils.ConfigsReader;

public class DropDownDemo extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
			
	driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
	driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));		
			
	WebElement dd = driver.findElement(By.id("dAcademicYear_list"));
	
	Select selDD = new Select(dd);
	
	//1.way
	selDD.selectByIndex(0);
	
	//2. way
	selDD.selectByValue("10");
	
	//3.way
	selDD.selectByVisibleText("2017-2018");
	
	
	//list of webelement
	List<WebElement> option = selDD.getOptions();
	System.out.println("The size of list is: " + option.size());
	
	for(int i=0; i<option.size(); i++) {
		selDD.selectByIndex(i);
		Thread.sleep(5000);
	}
	
	
	
	//Thread.sleep(5000);
	tearDown();
	
	}
	
	
	
	
	
}
