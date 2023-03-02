package Homework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Lesson7Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
/*
1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed.Switch to the parent window.
6) Quit all browsers

*/
		setUp();
		
		
		//driver.findElement(By.xpath("/html/body/p/a")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Thread.sleep(3000);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		// Exception = RunTime Error
		// String window3 = it.next();

		// We need to change the focus to the child window/tab
		driver.switchTo().window(childWindow);
		
		// Locating an element in the child page
		driver.findElement(By.xpath("//input['name=emailid']")).sendKeys("domino@gmail.com");
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		// Using Full xPath
		String userID = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();

		// Using Relative xPath
		String password = driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		
		Thread.sleep(1000);

		// How to switch to the parent window
		// 1. Leave this page open and switch to the other handle
		// 2. Close the current window. We are automatically focusing to the other page

		driver.close();
		// driver.switchTo().window(parentWindow);

		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
		
	}

}
