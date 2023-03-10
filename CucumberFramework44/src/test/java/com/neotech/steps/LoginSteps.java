package com.neotech.steps;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

//	LoginPageElements login;
//	DashboardPageElements dashboard;

	@Given("I navigated to the HRM website")
	public void i_navigated_to_the_hrm_website() {
		// This is done in the Hooks
		// setUp();

//		login = new LoginPageElements();
//		dashboard = new DashboardPageElements();
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.logInButton);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		if (actual.equals(expected)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

	@Then("I will quit the browser")
	public void i_will_quit_the_browser() {
		// This is done in the Hooks
		// tearDown();
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(login.password, "dede");
	}

	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed() {

		String expectedText = "Invalid Credentials";
		String actualText = login.invalidMsg.getText();

		if (actualText.equals(expectedText)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}
  
	
	// Bu searc employee sayfasundaydi sadece heryerde 
	//test edildigini gostermek icin buraya attik
	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		// This is done in the Hooks
		// setUp();

		login.adminLogin();
	}

}
