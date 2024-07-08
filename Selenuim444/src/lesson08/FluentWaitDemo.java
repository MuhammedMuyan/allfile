package lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utils.BaseClass;

public class FluentWaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.findElement(By.xpath(null)).click();
		
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		
		wait.withTimeout(Duration.ofSeconds(0));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(null)));
		
		
		WebElement div = driver.findElement(By.xpath(null));
		
		boolean isDisplayed =div.isDisplayed();
		System.out.println("Div isDisplayed: " + isDisplayed);
		
		
		
		tearDown();
		
		
	}

}
