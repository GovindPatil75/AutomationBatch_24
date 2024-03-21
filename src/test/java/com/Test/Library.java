package com.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Library {
	
	
	public static void getScreenshotWebpage(WebDriver driver) throws Exception {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir");
		File destn=new File(path+"\\test.png");
		FileUtils.copyFile(Src, destn);
	}

}
