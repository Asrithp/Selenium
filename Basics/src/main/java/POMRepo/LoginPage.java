package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	
//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//Declaration
	
	@FindBy(xpath="//input[@id=\"user-name\"]")
	private WebElement UserTextField;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement PasswordTextField;	
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	private WebElement LoginButton;
	
//Getter method

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	
	
	
	
	
	
	
	
}
