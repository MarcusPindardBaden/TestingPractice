package com.qa.testing.ShoppingTest;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DDTTest {
	
	FileInputStream file = null;
	XSSFSheet sheet = null;
	XSSFCell email_address = null;
	XSSFCell Title = null;
	XSSFCell First_name = null;
	XSSFCell Last_name = null;
	XSSFCell Password = null;
	XSSFCell Date = null;
	XSSFCell Month = null;
	XSSFCell Year = null;
	XSSFCell Address = null;
	XSSFCell Line_2 = null;
	XSSFCell City = null;
	XSSFCell Zip = null;
	XSSFCell Country = null;
	XSSFCell Add_info = null;
	XSSFCell home_phone = null;
	XSSFCell mobile_phone = null;
	XSSFCell alias = null;
	
	
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	}
	
	
	@Test
	public void DDT() {
		
	}
	
	
	@After
	public void tearDown() {
		
	}

}
