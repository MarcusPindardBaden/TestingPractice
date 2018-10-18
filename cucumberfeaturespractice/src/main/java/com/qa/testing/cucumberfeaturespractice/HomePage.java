package com.qa.testing.cucumberfeaturespractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menuBar;
	public void movetoMenu(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(menuBar).click().perform();	
	}
	
}
