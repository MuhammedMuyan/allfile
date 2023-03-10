package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * TC 1: Facebook dropdown verification 
		 * 1. Open chrome browser 
		 * 2. Go to https://www.facebook.com/r.php 
		 * 3. Verify: month dd has 12 month options day dd has 31 day options year dd has 118 year options 
		 * 4. Select your date of birth 
		 * 5. Quit browser
		 */
		
		
		setUp();
		
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selDay = new Select(driver.findElement(By.id("day")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		System.out.println("year: " + selYear.getOptions().size());
		System.out.println("month: " + selMonth.getOptions().size());
		System.out.println("day: " + selDay.getOptions().size());
		
		
       //System.out.println(selDay.getOptions().size()==31);
		
		
			//let us select our birthday
			selYear.selectByVisibleText("1993");
			selMonth.selectByValue("10");
			selDay.selectByIndex(27);
			
			Thread.sleep(3000);
			
			tearDown();
		
		
		
		
		
		
		
		
		
		
		

	}

}
