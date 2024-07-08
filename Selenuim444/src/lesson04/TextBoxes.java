package lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextBoxes {

	public final static String url = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407&AdSource=aw-DC-Templates-SEM&gad_source=1&gclid=EAIaIQobChMI_przn43NhQMVmmJHAR3GLg-pEAAYASAAEgImrPD_BwE";
	
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.driver.chrome", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("hakan");
		
		
		// 2. way
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']"));
		fname.clear();
		fname.sendKeys("baris");
		String idAttribute = fname.getAttribute("id");
		System.out.println("Value of the class attribute is: " + idAttribute);
		
		
		
		
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
