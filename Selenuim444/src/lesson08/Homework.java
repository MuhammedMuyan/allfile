package lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.BaseClass;

public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("domino@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String userID = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		String password = driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		
		System.out.println("user id; " + userID);
		System.out.println("password: " + password );
		
		
		//how to switch parent
		
		
		
		
		tearDown();
		
	}

}
