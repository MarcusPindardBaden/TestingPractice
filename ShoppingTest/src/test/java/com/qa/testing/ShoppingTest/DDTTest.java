package com.qa.testing.ShoppingTest;


import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DDTTest {
	
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	}
	
	
	@Test
	public void DDT() {
		DDTClass mo = new DDTClass();
		mo.inputData();
		
	}
	
	
	@After
	public void tearDown() {
		
	}

}
