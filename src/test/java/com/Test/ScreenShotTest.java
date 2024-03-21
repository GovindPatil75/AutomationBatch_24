package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShotTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		String path=System.getProperty("user.dir");
        System.out.println(path); //C:\Users\Dell\eclipse-workspace\AutomationBatch_24
		
        String RM=RandomString.make(4);// String 
        // ScreenShot capture - full page 
		
		TakesScreenshot ts=driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
        File drstn=new File(path+"\\"+RM+".png");
        FileUtils.copyFile(src, drstn);
        
        // WebElement SecreenShot 
        WebElement Register=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
        File src1=Register.getScreenshotAs(OutputType.FILE);     
        File detsn1=new File(path+"\\Logo.png");
        FileUtils.copyFile(src1, detsn1);
        
	}

}
