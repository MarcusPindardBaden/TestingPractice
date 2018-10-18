package com.qa.testing.Parameterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
	    driver.get(arg1);
	    
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
		WebElement element = driver.findElement(By.id("sb_form_q"));
	    element.sendKeys(arg1);
	    element.submit();
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
		WebElement resultElement = (new WebDriverWait(driver, 2)).until(ExpectedConditions.presenceOfElementLocated(By.id("b_results")));
	}
	@After
	public void tearDown() {
		driver.quit();
	}

}
