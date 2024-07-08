package lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		
		WebElement enable = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		enable.click();
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));

		wait.until(ExpectedConditions.elementToBeClickable(textBox));
		//wait.until(ExpectedConditions.visibilityOf(textBox));
		
		textBox.sendKeys("Mehmet");
		
		Thread.sleep(5000);
		
		tearDown();
		
	}

}
