package com.sauce.TestcaseClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauce.POMClasses.LoginPomPage;

public class TestBaseClass 
{    
	WebDriver driver;

	Logger log = Logger.getLogger("SauceDemo");
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void setUpMethod(String browsername)
	{
      if(browsername.equals("chrome"))
		{
    	  System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");	
		 driver = new ChromeDriver();
		}
      else if(browsername.equals("firefox"))
		{
  	     System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");	
		 driver = new FirefoxDriver();
		}
      
      else
      {
    	  System.out.println("Throw the error");
      }
      
      PropertyConfigurator.configure("log4j.properties");
      
		log.info("Browser is Opened");
		
		driver.manage().window().maximize();
		log.info("Browser is maximize");
				
		
		
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPomPage lp = new LoginPomPage (driver);
		
		lp.sendUsername();
		log.info("Username is Entered");
		lp.sendPassword();
		log.info("Password is Entered");
	    lp.loginButtonClick();
		log.info("Click on Login Button");
	}
	
   @AfterMethod
	
	public void tearDownMethod()
	{
		driver.quit();
       log.info("Browser is Closed");
	}
	
	
	
	
	
	
	
	
	
	
	
}
