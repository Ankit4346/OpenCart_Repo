package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id="input-email")
	WebElement emaill; 
	
	@FindBy (id="input-password")
	WebElement pwdl; 
	
	@FindBy (xpath="//input[contains(@class,\"btn btn-primary\")]")
	WebElement continuebtn;
	
	// Actions
	public void EmailLogin(String email) {
		emaill.sendKeys(email);
	}
	
	public void PasswordLogin(String password) {
		pwdl.sendKeys(password);	}
	
	public void ContinueLogin() {
		continuebtn.click();
	}
	
	
	
}
