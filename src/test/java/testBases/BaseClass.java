package testBases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	
	@BeforeClass(groups = { "Master", "Sanity", "Regression" })
	@Parameters("browser")
	public void setUp(String s){
		
		logger=LogManager.getLogger(this.getClass()); // logging
		rb=ResourceBundle.getBundle("config");
		
		/*EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});*/
		
		if(s.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(s.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
	
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups = { "Master", "Sanity", "Regression" })
	public void tearDown(){
		driver.quit();
	}

	public String RandomAlphabets() {
		String alpha= RandomStringUtils.randomAlphabetic(5);
		return alpha;
	}
	
    public String RandomNumbers() {
    	String num= RandomStringUtils.randomNumeric(7);
		return num;
	}
	
    public String RandomAlphaNum() {
    	String alphaNum= RandomStringUtils.randomAlphanumeric(12);
		return alphaNum;
	}
    
    public String captureScreen(String tname) {
    	SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddhhmmss");
    	Date dt=new Date();
    	
    	String timeStamp= sf.format(dt);
    	
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
    	
    	try {
			FileUtils.copyFile(src, new File(destination));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return destination;
    	
    }
    
}



