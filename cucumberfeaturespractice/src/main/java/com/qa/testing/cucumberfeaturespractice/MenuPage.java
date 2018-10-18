package com.qa.testing.cucumberfeaturespractice;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	private WebElement greenTea;
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	private WebElement redTea;
	@FindBy( xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
	private WebElement OolongTea;
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement checkoutButton;
	
	public boolean checkingTheyExist()
	{
		try{
			greenTea.getLocation();
			redTea.getLocation();
			OolongTea.getLocation();
			//checkTheyExist2();
			return true;
		
	}
	catch (NoSuchElementException e) 
		{
		System.out.println(e);
		return false;
	}
	}
	
	public void goToCheckout(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(checkoutButton).click().perform();
	}

}
