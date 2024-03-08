package com.Test;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationTestScript {

	public static void main(String[] args) {
		
		// browser execution -need executable setup 
		WebDriverManager.chromedriver().setup();
		// Browser execution -- Browser driver class Object
		ChromeDriver driver=new ChromeDriver();
		// webdriver get() ---
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// gettitle() --- return String
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		// getcurrentUrl
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		//Navigation 
		driver.navigate().to("https://mvnrepository.com/");
		
		//Back
		driver.navigate().back();
	
		//Forward
		driver.navigate().forward();
		
		//Refresh Webpage
		driver.navigate().refresh();
		
		/*
		// Edge Browser 
		// browser execution -need executable setup
		WebDriverManager.edgedriver().setup();
		// Browser execution -- Browser driver class Object
		EdgeDriver driver1=new EdgeDriver();
		
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		
		*/
		
	}

}
