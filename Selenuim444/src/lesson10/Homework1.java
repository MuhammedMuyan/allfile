package lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Homework1 extends BaseClass{

	public static void main(String[] args) {

		List<WebElement> rows = driver.findElements(By.xpath(null));
		
		for (int i=0; i< rows.size(); i++) {
			
		}
		
	}

}
