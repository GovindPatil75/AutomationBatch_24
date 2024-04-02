package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Library {
	
	
	public static void getScreenshotWebpage(WebDriver driver) throws Exception {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir");
		File destn=new File(path+"\\test.png");
		FileUtils.copyFile(Src, destn);
	}
	
	public static void custom_SendKeys(WebElement element,String value) {
		
		element.sendKeys(value);
	}
	
	public static void scrolltoElement(ChromeDriver driver,WebElement element) {
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public static Actions getActions(WebDriver driver) {
		Actions act=new Actions(driver);
		return act;
	}
	
    public static Alert getAlertHandle(WebDriver driver) {
	
    	return driver.switchTo().alert();
    }
    
    public static String getExcelTestDataString(String sheetname,int row,int cell) throws Exception {
    	
      String Excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
	  FileInputStream fis=new FileInputStream(Excelpath);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	  return data;
			
    }
    
    public static double getExcelTestDataNumeric(String sheetname,int row,int cell) throws Exception {
    	
        String Excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
  	  FileInputStream fis=new FileInputStream(Excelpath);
  	  XSSFWorkbook wb=new XSSFWorkbook(fis);
  	  double data=wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
  	  return data;
  			
      }
    
    
    
    
}
