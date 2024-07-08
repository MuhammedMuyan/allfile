package lesson02;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		
		
		System.out.println("Expected Title > "  + expectedTitle);
		System.out.println("Actual Title > " + actualTitle);
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		
		
		try {
			Thread.sleep(5);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
