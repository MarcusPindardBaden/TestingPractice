package com.qa.testing.ShoppingTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class WebsiteTest {

		public WebDriver driver = null;
		//Setting up the report
		boolean replaceExisting = true;
		ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\GitHubTestingWeek\\ShoppingTest.html",replaceExisting);
		ExtentTest test;
		
		
		
		//initialising the webDriver before we begin 
		@Before
		public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		//Quitting the driver
		@After
		public void tearDown() {
			driver.quit();
		}
		
		//sets the test to call the HomePage class, and method contained then the searched page
		@Test
		public void funcTest() {
			//Initialising the test
			test = extent.startTest("Verify application Title");
			driver.get("http://automationpractice.com/index.php");
			test.log(LogStatus.INFO, "Bowser started");
			HomePage page = PageFactory.initElements(driver, HomePage.class);
			page.dressSearch("stringToSearch", driver);
			SearchedPage page2 = PageFactory.initElements(driver, SearchedPage.class);
			//assertEquals("Actual was not Expected", "true", page2.findingAButton());
			
			if(page2.findingAButton()==true) {
				test.log(LogStatus.PASS, "Search provided a usable result");
			}
			else {
				test.log(LogStatus.FAIL, "Search provided no usable result");
			}
			extent.endTest(test);
			extent.flush();
			
			assertEquals(true ,page2.findingAButton());
		}
		
}

