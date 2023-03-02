package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass{
	// http://uitestpractice.com/Students/Switchto
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();	
		
	driver.findElement(By.id("alert")).click();	
	Thread.sleep(2000);	
		
		
	Alert simpleAlert = driver.switchTo().alert();
	
	String alertText = simpleAlert.getText();
	System.out.println("The simpl alert say " + alertText);
	Thread.sleep(2000);
	simpleAlert.accept();
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("confirm")).click();
	
	
	//we are trying to swith the focus of the driver to the alert
	Alert confirm = driver.switchTo().alert();
	String confirmationText = confirm.getText();
	System.out.println(confirmationText);
	//if we want to accept this
	//	confirm.accept();
	
	 //if I don't want to accept this
	confirm.dismiss();
	Thread.sleep(2000);
	
	
	//handling prompt alert
			driver.findElement(By.id("prompt")).click();
			Thread.sleep(2000);
			
			Alert prompt = driver.switchTo().alert();
			System.out.println(prompt.getText());
			prompt.sendKeys("Sabah");
			Thread.sleep(4000);
			prompt.accept();
				
			Thread.sleep(2000);

			tearDown();
	
	
	
	
	
	
		
		
		
		
	}

}
