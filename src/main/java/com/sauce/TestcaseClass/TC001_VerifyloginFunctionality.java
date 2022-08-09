package com.sauce.TestcaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.POMClasses.LoginPomPage;
import com.sauce.POMClasses.ScreenshotClass;



public class TC001_VerifyloginFunctionality extends TestBaseClass

{

   @Test
    public void loginFunctionality() throws IOException
	{
	
	    ScreenshotClass.takeScreenshot(driver);
	    log.info("Screenshot is taken");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		
		log.info("Doing Validation for login functionality");
		Assert.assertEquals(actualTitle ,expectedTitle,"Not Matched");
			
	}
	
	
	
	
	
}
