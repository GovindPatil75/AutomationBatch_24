package com.Test;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EXcelTestDatReaderTest {

	public static void main(String[] args) throws Exception {
		
		// Step 1 -- excel location -- string 
		String Path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		
		// Object FileINputStream --- Path
		FileInputStream fis=new FileInputStream(Path);
		
		// Object XSSFWorkbook class -- implentation Workbook interface method
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String Data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String Data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(Data_1);
		System.out.println(Data_2);
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Data_1);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Data_2);
		

	}

}
