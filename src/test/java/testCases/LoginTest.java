package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;

public class LoginTest extends BaseClass{
  
	@Test(groups= {"Sanity","Master"})
	public void LoginValidation() {
		
		HomePage hp= new HomePage (driver);
		
		hp.MyAccountPage();
		hp.loginClick();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.EmailLogin(rb.getString("email"));
		lp.PasswordLogin(rb.getString("password"));
		lp.ContinueLogin();
		
		MyAccountPage ap=new MyAccountPage(driver);
		
		try{
			
		String status=ap.LoginSuccess();
			
		Assert.assertEquals("My Account", status, "Login not successful");
		
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		
	}	
	
}
