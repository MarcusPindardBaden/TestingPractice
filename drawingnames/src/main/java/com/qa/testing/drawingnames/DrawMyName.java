package com.qa.testing.drawingnames;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrawMyName {
	public WebDriver driver = null;
	public Actions action = null;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		Actions draw = new Actions(driver);
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
