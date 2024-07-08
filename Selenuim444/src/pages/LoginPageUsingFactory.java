package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;
import utils.CommonMethods;

public class LoginPageUsingFactory extends CommonMethods {

	
	@FindBy(id = "textusername")
	public WebElement username;
	
	@FindBy(name = "txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	
	
	
	public LoginPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver  , this);
	}
	
	
	
	
}
