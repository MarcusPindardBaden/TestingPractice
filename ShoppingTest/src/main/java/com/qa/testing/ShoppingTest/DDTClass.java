package com.qa.testing.ShoppingTest;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class DDTClass {
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
	

	
}


//Steps needed:
//1. Create file path to excel file
//2. Create a for loop
//3. set up the rows to be imported in the for loop
//4. create an explicit wait between the first input and the rest of the inputs
//5. Set up rows to be inserted on more than one occasion