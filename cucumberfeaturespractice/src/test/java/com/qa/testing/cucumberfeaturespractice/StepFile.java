package com.qa.testing.cucumberfeaturespractice;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFile {
	public WebDriver driver = null;
	boolean replaceExisting = false;
	
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\GitHubTestingWeek\\cucumberfeaturespractice\\report.html",replaceExisting);
	ExtentTest test;
	
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		test = extent.startTest("Test initiated");
	}
	
			@Given("^the correct web address$")
			public void the_correct_web_address()
			{
				driver.get("http://www.practiceselenium.com/welcome.html");
				test.log(LogStatus.INFO, "Browser started");
			}
		
			
			@When("^I navigate to the 'Menu' page$")
			public void i_navigate_to_the_Menu_page() 
			{
				HomePage page = PageFactory.initElements(driver, HomePage.class);
				page.movetoMenu(driver);
				test.log(LogStatus.INFO, "Menu Page reached");
			}
		
			
			@Then("^I can browse a list of the available products\\.$")
			public void i_can_browse_a_list_of_the_available_products() 
			{
				MenuPage page2 = PageFactory.initElements(driver, MenuPage.class);
				if(page2.checkingTheyExist() == true) {
					test.log(LogStatus.PASS, "I can browse a list of available products");
				}
				else {
					test.log(LogStatus.FAIL, "I cannot browse a list of available products");
				}
				assertEquals("No info available",true ,page2.checkingTheyExist());
			}
		
			
			@When("^I click the checkout button$")
			public void i_click_the_checkout_button()
			{
				HomePage page = PageFactory.initElements(driver, HomePage.class);
				page.movetoMenu(driver); 
				test.log(LogStatus.INFO, "Menu page reopened");
				MenuPage page2 = PageFactory.initElements(driver, MenuPage.class);
				page2.goToCheckout(driver);
				test.log(LogStatus.INFO, "Checkout button clicked");
			}
		
			
			@Then("^I am taken to the checkout page$")
			public void i_am_taken_to_the_checkout_page() throws Throwable 
			{
			    CheckOutPage page3 = PageFactory.initElements(driver, CheckOutPage.class);
			    if(page3.isTheFormThere() == true) {
					test.log(LogStatus.PASS, "The checkout page has been reached");
				}
				else {
					test.log(LogStatus.FAIL, "The checkout page wasn't reachable");
				}
			    assertEquals("Form does not exist", true, page3.isTheFormThere());
			}
	
	
	@After
	public void tearDown() {
		driver.quit();
		extent.endTest(test);
		extent.flush();
		
	}
}
