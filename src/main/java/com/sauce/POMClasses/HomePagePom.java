package com.sauce.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePom 
{

	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement SettingButtonClick;
	
	public void settingButton()
	{
		SettingButtonClick.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOut;
	
	public void LogoutButton()
	{
		logOut.click();
	}
	
//	bag Product
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement BagButton;
	
	public void clickonBagButton()
	{
		BagButton.click();
	}
	
//	add to cart button
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addtoCartButton;
	 
	public String getTextfromCartButton()
	{
		String totalProducts = addtoCartButton.getText();
		return totalProducts;
				
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")

	private List<WebElement> multiAddToCartButton;
	
	public void addAllProducts()
	{
		
		for(int i=1; i<=multiAddToCartButton.size(); i++)
		{
			multiAddToCartButton.get(i).click();
		}
		
		
	}
	
	//filter dropdown
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropDownFilter;
	
	public void clickOnDropDownFilter()
	{
		dropDownFilter.click();
		s.selectByVisibleText("Price (low to high)");
		
	}

	
	
	

	public HomePagePom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		s= new Select(dropDownFilter);
	}
	
	
	
}
