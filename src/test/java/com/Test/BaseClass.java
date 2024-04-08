package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
    WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() {
		
		System.out.println("Browser Open");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teraDown() {
		System.out.println("Browser Window -Close");
		
		driver.quit(); // current +open window =close
	}
}
