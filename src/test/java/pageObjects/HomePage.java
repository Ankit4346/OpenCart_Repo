package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	public WebDriver driver;

	public HomePage(WebDriver driver){
		super(driver); 
	}
	
	// WebElements
	@FindBy (xpath="//span[text()='My Account']")
	WebElement myAccount;
	
	@FindBy (linkText="Register")
	WebElement register;
	
	@FindBy (linkText="Login")
	WebElement login;    
	
	// Actions
	public void MyAccountPage() {
		myAccount.click();
	}
	
	public void Register() {
		register.click();
	}
	
	public void loginClick() {
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
