package lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText(null)).click();
		
		WebElement div = driver.findElement(By.xpath(null));
		
		
		
		
		
		
		
		tearDown();
		
		
	}

}
