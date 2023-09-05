package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//div[@id='content']/h2")
	WebElement loginSuccess; 
	
	
	public String LoginSuccess() {
		String act_result=loginSuccess.getText();
		
		return act_result;
	}
	
		
}
