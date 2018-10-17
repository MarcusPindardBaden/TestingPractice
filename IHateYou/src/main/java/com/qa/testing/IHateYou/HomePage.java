package com.qa.testing.IHateYou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy(id = "quote")
	private WebElement quotation;
	public boolean quoteFinder(WebDriver driver){
		WebElement element = (new WebDriverWait(driver,6)).until(ExpectedConditions.presenceOfElementLocated(By.id("shafeeq")));
		return true;
	}
	
}
