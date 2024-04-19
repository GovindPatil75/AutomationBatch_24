package com.CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObjectRepo.LoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTest_T7 {

	
	@Test
	public void verifyFBTC_001() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// WebElement -- 
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		//HomepagePom home=PageFactory.initElements(driver, HomepagePom.class);
		
		login.getEmail().sendKeys("Test");
		login.getPassword().sendKeys("12345678");
		login.getLoginBtn().click();
		
		
		
		
		
		
		
		
		
	}
}
