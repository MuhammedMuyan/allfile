package lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;
import utils.ConfigsReader;

public class Task1 extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();
		driver.findElement(By.linkText("Disciplinary Cases")).click();
		
		
		//notice frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("searchModal")).click();
		
		//click on the calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();
		
		
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//li/span[text()='January']")).click();
		
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']/tbody/tr/td"));
		
		
		for(WebElement date : dates) {
			if(date.getText().equals("6")) {
				date.click();
				break;
			}
		}
		
		
		//next date
		
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();
		
		
		
		
		
		tearDown();

	}

}
