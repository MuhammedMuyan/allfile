package lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class EplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(null))));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
		
		
		WebElement div = driver.findElement(By.xpath(null));
		
		boolean isDisplayed = div.isDisplayed();
		
		
		
		tearDown();
		
	}

}
