package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBases.BaseClass;

public class AccountRegistrationTest extends BaseClass{
	
	   SoftAssert sa=new SoftAssert();
	
	@Test(groups= {"Regression","Master"})
	public void Test_accountRegistration() {
		
		logger.debug("application logs......");
		
		logger.info("___________________ Starting Registration Process _______________________________");
		
	 try {
		HomePage hp=new HomePage(driver);
		
		hp.MyAccountPage();
		
		logger.info("Clicked on My Account link");
		
		hp.Register();
		
		logger.info("Clicked on My Register link");
		
		RegistrationPage rp=new RegistrationPage(driver);
		
		logger.info("_____________ Entering Customer details ___________________________");
		
		rp.FirstName(RandomAlphabets().toUpperCase());
		rp.LastName(RandomAlphabets().toUpperCase());
		rp.EmailId(RandomAlphabets()+"@gmail.com"); // generating email randomly
		rp.Telephone(RandomNumbers());
		String pswd=RandomAlphaNum();
		rp.Password(pswd);
		rp.CnfPassword(pswd);
		rp.PrivacyPolicy();
		rp.Submit();
		
		logger.info("Clicked on Continue");
		
       String confmsg=rp.getConfirmationMsg();
		
    
		sa.assertEquals(confmsg, "Your Account Has Been Created!");
	
		
		logger.error("Validation fails");
		
		
		}
	
		catch(Exception e)
		{
			logger.error("Validation fails");
			sa.fail();
			
		}
	 logger.info(" Registration completed");
	
	 sa.assertAll();
		
	}	
}
