package com.qa.testing.ShoppingTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTClass {
	Constants constant = new Constants();
	
	public void inputData() throws FileNotFoundException{
		FileInputStream file = new FileInputStream(constant.Path_TestData);
		XSSFWorkbook workbook = null;
		XSSFCell cell;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 1; i < 17; i++) {
			for(int j=0; j<4;j++) {
				cell = sheet.getRow(j).getCell(i);
				cell.getStringCellValue();
			}
		}
	}

	

	

}


//Steps needed:
//1. Create file path to excel file
//2. Create a for loop
//3. set up the rows to be imported in the for loop
//4. create an explicit wait between the first input and the rest of the inputs
//5. Set up rows to be inserted on more than one occasion