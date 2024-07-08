package test;

import pages.DashboardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {
		
		//https://hrm.neotechacademy.com/
		
		setUp();
		
		//locating element
		LoginPage login = new LoginPage();
		
		
		//send text
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(2);

		
		sendText(login.password, ConfigsReader.getProperty("password"));
		wait(2);

		
		click(login.loginBtn);
		
		
		wait(5);
		
		
		
		//Validate login
		DashboardPage dashboard = new DashboardPage();
		
		if(dashboard.logo.isDisplayed()) {
			System.out.println("Test Passes!");
		}else {
			System.out.println("Test Failed!");
		}
		
		
		String expectedName = "Jacqueline White";
		
		String actualName = dashboard.name.getText();
		
		if(actualName.equals(expectedName)) {
			System.out.println(expectedName + " is Displayed ");
		}else { 
			System.out.println(expectedName + " is NOT Displayed");
		}
		
		
		
		
		
		
		
		tearDown();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
