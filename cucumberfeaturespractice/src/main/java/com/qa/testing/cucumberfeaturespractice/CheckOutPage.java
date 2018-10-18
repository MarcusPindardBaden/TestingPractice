package com.qa.testing.cucumberfeaturespractice;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {

		@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form")
		WebElement checkoutForm;
		
		public boolean isTheFormThere() 
		{
				try{
					checkoutForm.getLocation();
					return true;
				
			}
			catch (NoSuchElementException e) 
				{
				System.out.println(e);
				return false;
			}
		}
}
