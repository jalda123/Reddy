package com.Automation.Interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {

	@Test
	
	public void excel() throws IOException {
		
		File src = new File(System.getProperty("user.dir")+"/Excelsheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wrb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wrb.getSheetAt(0);
		
		//count rows
		
		
		
		String value =sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
	}
}
