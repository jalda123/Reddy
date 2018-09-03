package com.Automation.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src = new File("E:\\New folder\\Workshop\\Facebook\\Excelsheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wrb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wrb.getSheetAt(0);
		
		XSSFRow row = sheet1.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		

	}

}
