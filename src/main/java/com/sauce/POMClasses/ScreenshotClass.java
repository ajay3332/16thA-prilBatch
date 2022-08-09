package com.sauce.POMClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{

	public static void takeScreenshot(WebDriver driver) throws IOException 
	{
	Date d = new Date();
	DateFormat d1 = new SimpleDateFormat("DD-mm-yy & HH-mm-ss");
	String date = d1.format(d);
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File Dest = new File("./ScreenShotFolder/sauceDemo"+date+".jpg");
	
	FileHandler.copy(source, Dest);
	
	
	}
	
	
	
}
