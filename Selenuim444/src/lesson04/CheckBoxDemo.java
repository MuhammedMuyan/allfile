package lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public final static String url = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407&AdSource=aw-DC-Templates-SEM&gad_source=1&gclid=EAIaIQobChMI_przn43NhQMVmmJHAR3GLg-pEAAYASAAEgImrPD_BwE";

	
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.driver.chrome", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	    WebElement maleRB =  driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
	    maleRB.click();
		
		
		
	  List<WebElement> elements = driver.findElements(By.xpath("//table[@class='inline_grid choices]/tbody/tr/td/label"));
	    
	  for(WebElement el : elements) {
		  
		  String text = el.getText();
		  
		  if(text.equals("Female")) {
			 el.click();
			 Thread.sleep(5000);
		  
		  }else if(text.equals("Monday")) {
		  el.click();
		  Thread.sleep(5000);

		  } else if(text.equals("Wednesday")) {
			  el.click();
			  Thread.sleep(5000);    
		  }
	  
	  
	  }
	    
	    
	    
	    
	    
		
		Thread.sleep(5000);
		driver.quit();
	}

}
