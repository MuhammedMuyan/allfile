package lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class MultipleSelectDropDown extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement multiSelect = driver.findElement(By.id(""));
		Select sel = new Select(multiSelect);
		
		//check if the drop down is multiple
		boolean isMlp = sel.isMultiple();
		System.out.println("is this multiple select? " + isMlp);
		
		
		if(isMlp) {
			
			List<WebElement> options = sel.getOptions();
		
			for(WebElement we : options) {
				
				String text = we.getText();
				sel.selectByVisibleText(text);
				Thread.sleep(5000);
				
			}
		
			sel.deselectByIndex(1);
			sel.deselectAll();
		}
		
		
	
		
		tearDown();
	
	}
	
	
	
}
