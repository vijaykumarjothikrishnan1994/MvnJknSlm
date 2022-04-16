package com.helms.configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ConfigureData {
	
	@Test
	public void TestData() throws IOException {
		
		File file=new File("C:\\Users\\VI20228228\\Desktop\\Software\\NewLocation\\HelmsAutomationPro\\MasterReadData\\MasterReadDatas.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook Workbook=new XSSFWorkbook(fis);
		XSSFSheet Sheet=Workbook.getSheetAt(0);
		
		System.out.println(Sheet);
		int LastRowNum=Sheet.getLastRowNum();
		for(int i=0;i<=LastRowNum;i++)
		{
			String FirstColoumn=Sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(FirstColoumn);
			String SecondColoumn=Sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(SecondColoumn);
		}
		
	}

}
