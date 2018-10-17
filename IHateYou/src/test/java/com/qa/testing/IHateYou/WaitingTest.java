package com.qa.testing.IHateYou;

import static org.junit.Assert.assertEquals;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class WaitingTest {
	public WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void waitingForIt() {
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		HomePage page = PageFactory.initElements(driver, HomePage.class);
		assertEquals("Not loaded", true, page.quoteFinder(driver));
	}
	@After
	public void tearDown() 
	{
		driver.quit();
	}


}
