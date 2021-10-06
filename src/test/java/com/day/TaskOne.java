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

public class TaskOne {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\SABU\\MAVEN\\24.09.2021\\excel\\TASK1.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		
	for (int i = 0; i < sheet.getPhysicalNumberOfRows()	; i++) {
		
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells()	; j++) {
			
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
		
		
	}
		
		
		

		
		
		
		
		
		
		
	}

}
