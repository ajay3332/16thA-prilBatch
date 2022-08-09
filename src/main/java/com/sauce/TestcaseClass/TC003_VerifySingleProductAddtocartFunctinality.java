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

public class TC003_VerifySingleProductAddtocartFunctinality extends TestBaseClass
{

	@Test
   public void verfySingleBagFunctionality() throws IOException
   
   {

    HomePagePom hp = new HomePagePom(driver);
    
    hp.clickonBagButton();
    ScreenshotClass.takeScreenshot(driver);
    log.info("Screenshot is taken");
    
    String actualCount = hp.getTextfromCartButton();
	String expectedCount ="1";
	
	log.info("Applying Validation");
	Assert.assertEquals(actualCount, expectedCount);
	
   }	
	
  

	
}
	
	
	

