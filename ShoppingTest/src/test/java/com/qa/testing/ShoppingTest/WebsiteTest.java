package com.qa.testing.ShoppingTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebsiteTest {

		public WebDriver driver = null;
		@Before
		public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		@After
		public void tearDown() {
			driver.quit();
		}
		@Test
		public void funcTest() {
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.id("search_query_top")).click();
			driver.findElement(By.id("search_query_top")).sendKeys("dress");
			driver.findElement(By.id("search")).click();
			assertEquals("Actual was not Expected", "true", findingAButton());
			
			
		}
		public boolean findingAButton() {
			try {
				driver.findElement(By.className("product-container"));
				return true;
			}
			catch (NoSuchElementException e) {
				return false;
			}
		}
}

