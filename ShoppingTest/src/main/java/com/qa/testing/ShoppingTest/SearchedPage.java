package com.qa.testing.ShoppingTest;

//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchedPage {
	@FindBy
	(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement resultDress;
	
		public boolean findingAButton() {
			try {
			resultDress.getLocation();
			
				return true;
			}
			catch (Exception e) {
				System.out.println(e);
				return false;
			}
		}
}
