package com.day;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TenEntries {
public static void main(String[] args) throws IOException {
	File excel=new File("C:\\Users\\SABU\\MAVEN\\24.09.2021\\excel\\Book1.xlsx");
	FileInputStream a=new FileInputStream(excel);
	Workbook b = new XSSFWorkbook(a);
	//getsheet(excel sheet name)
	
	
Sheet sheet = b.getSheet("Sheet1");
//to get all row and column values
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		System.out.println(cell);
		}
}
//	Row row = sheet.getRow(1);
//	Cell cell = row.getCell(1);
//	System.out.println(cell);
	
//	//cell containing values with respet to row index
//	Row row2 = sheet.getRow(2);
//	int g = row2.getPhysicalNumberOfCells();
//	System.out.println(g);

	//row cointaining value
//	int h = sheet.getPhysicalNumberOfRows();
//	System.out.println(h);
//	
//	Cell cell2 = row.getCell(0);
//	Cell cell3 = row.getCell(1);
//	System.out.println(cell2);
//	System.out.println(cell3);
}
}
