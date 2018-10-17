package com.qa.testing.ShoppingTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id = "searchbox")
	private WebElement searchBar;
	
	public void dressSearch(String enter, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(searchBar).click().perform();
		action.moveToElement(searchBar).sendKeys("dress").perform();
		action.moveToElement(searchBar).sendKeys(Keys.ENTER).perform();
	}

}
