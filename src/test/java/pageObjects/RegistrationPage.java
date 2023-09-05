package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

	public WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		super(driver);
	}
	
	// WebElements
	@FindBy (id="input-firstname")
	WebElement fName;
	
	@FindBy (id="input-lastname")
	WebElement lName;
	
	@FindBy (id="input-email")
	WebElement email;
	
	@FindBy (id="input-telephone")
	WebElement telephone;
	
	@FindBy (id="input-password")
	WebElement password;
	
	@FindBy (id="input-confirm")
	WebElement cnfpassword;
	
	@FindBy (xpath="//input[@name='agree']")
	WebElement privacy;
	
	@FindBy (xpath="//input[@class='btn btn-primary']")
	WebElement submit;
	
	@FindBy (xpath="//div[@id='content']/h1")
	WebElement success;
	
	// Actions
	public void FirstName(String firstnm) {
		fName.sendKeys(firstnm);
	}
	
	public void LastName(String lastnm) {
		lName.sendKeys(lastnm);
	}
	
	public void EmailId(String emailad) {
		email.sendKeys(emailad);
	}
	
	public void Telephone(String tele) {
		telephone.sendKeys(tele);
	}
	
	public void Password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void CnfPassword(String pwd) {
		cnfpassword.sendKeys(pwd);
	}
		
	public void PrivacyPolicy() {
		privacy.click();;
	}
	
	public void Submit() {
		submit.click();
	}	
	public String getConfirmationMsg() {
		String validation=success.getText();
		return validation;
		
	}
	
	
	
}
