package testNG;

import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception  {
		
		//specify location of excel file
		File src = new File("C:\\Users\\Gokul\\Desktop\\Demo.xlsx");
		
		//load file
		
		FileInputStream fis = new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load Worksheet
		XSSFSheet sh1 = wb.getSheet("DemoSheet");
		
		//print the sheet name
		System.out.println(sh1.getSheetName());
		
		//print username from Excel
	//	System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//print p3 username from Excel
	//	System.out.println(sh.getRow(3).getCell(1).getStringCellValue());
		
		//print p5 username from Excel
		//System.out.println(sh.getRow(5).getCell(1).getStringCellValue());
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Gokul\\eclipse-workspace\\chromedriver_win32\\\\chromedriver.exe");
		//WebDriver d= new ChromeDriver();
		//d.manage().window().maximize();
		//d.get("https://www.facebook.com/");
		
		//Enter username from excel sheet
		//String a=sh.getRow(0).getCell(0).getStringCellValue();
		//String b=sh.getRow(0).getCell(1).getStringCellValue();
		
	//	d.findElement(By.id("email")).sendKeys(a);
		//d.findElement(By.id("pass")).sendKeys(b);
	}

}
