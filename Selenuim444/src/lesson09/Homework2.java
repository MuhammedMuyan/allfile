package lesson09;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utils.BaseClass;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		
		WebElement enable = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		enable.click();
		

		
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(20));
		fluentWait.pollingEvery(Duration.ofSeconds(2));
		
		fluentWait.ignoring(NoSuchElementException.class);
		
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(textBox));
		
		textBox.sendKeys("Mehmet");
		
		
		
		
		
		Thread.sleep(5000);
		tearDown();

	}

}
