package com.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	

}
