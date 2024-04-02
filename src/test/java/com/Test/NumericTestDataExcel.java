package com.Test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumericTestDataExcel {

	public static void main(String[] args) throws Exception {
		
		String Excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(Excelpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);

		double data=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
		
		System.out.println(data);
		
		String Data_1=String.valueOf(data);
		
		System.out.println(Data_1);
		
		String Data_2=Data_1.replace(".", "").replace("E7", "");
		
		System.out.println(Data_2);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys(Data_2);
	}

}
