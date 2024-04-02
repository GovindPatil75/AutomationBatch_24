package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocatorTest {

	public static void main(String[] args) throws Exception {
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// WebElement Identify -- locator -- name 
		
		String Username=Library.getExcelTestDataString("Sheet1", 0, 0);
		String passworddata=Library.getExcelTestDataString("Sheet1", 0, 1);
		
		WebElement EmailId=driver.findElement(By.name("email"));
		EmailId.sendKeys(Username);
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys(passworddata);
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();
		
		//Homepage Verify 
		
		String ExpectedTitle="Welcome to FB Homepage";
		String ActualTitle=driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle)) {
			
			System.out.println("Test case is pass");
		}else {
			
			System.out.println("Test case is Fail");
		}
		
		
		
		
		
		
		

	}

}
