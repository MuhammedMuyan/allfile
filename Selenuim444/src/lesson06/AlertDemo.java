package lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.findElement(By.id("alert")).click();
		
		
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		
		System.out.println("The simple alert says " + alertText);
		
		simpleAlert.accept();
		
		
		////////
		
		driver.findElement(By.id(alertText)).click();
		
		Alert confirm = driver.switchTo().alert();
		String confirmationText = confirm.getText();
		System.out.println(confirmationText);
		
		// if we want confirm
		//confirm.accept();
		
		// if we dont want to confirm
		confirm.dismiss();
		
		
		
		//ADIMLAR
		
		driver.findElement(By.id(""));
		Thread.sleep(5000);
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("");
		prompt.accept();
		
		//yada
		prompt.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
