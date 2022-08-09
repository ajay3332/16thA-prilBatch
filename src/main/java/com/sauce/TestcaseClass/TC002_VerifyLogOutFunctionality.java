  package com.sauce.TestcaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.POMClasses.HomePagePom;
import com.sauce.POMClasses.LoginPomPage;
import com.sauce.POMClasses.ScreenshotClass;

public class TC002_VerifyLogOutFunctionality extends TestBaseClass
{

		//Homepage Logout page Activity
		@Test
	    public void logOutFunctionality() throws IOException 
		{
		
		HomePagePom hm = new HomePagePom(driver);
		hm.settingButton();
		log.info("Click on Setting Button");
		hm.LogoutButton();
		log.info("Click On LogOut Button");
		
		ScreenshotClass.takeScreenshot(driver);
		log.info("Screenshot is taken");
	   
		
		String actualTitle =driver.getTitle();
		String expectedTitle ="Swag Labs";
		  log.info("Applying the Validation");
		Assert.assertEquals(actualTitle, expectedTitle); 
		
		
		}
		
	
		
				

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
