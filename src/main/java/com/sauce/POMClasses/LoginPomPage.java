package com.sauce.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage 
{

	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//html//body//div//form //div[1]//input")
	private WebElement userName;
	
	public void sendUsername()
	{
	   userName.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//html//body//div//form //div[2]//input")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
//	public void loginButtonClick()
//	{
//		loginButton.click();
//	}
	
	public void loginButtonClick()
	{
		act.click(loginButton).perform();
	}
	
	
	
	
	public LoginPomPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
