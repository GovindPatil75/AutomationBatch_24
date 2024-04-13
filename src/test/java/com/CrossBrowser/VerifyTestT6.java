package com.CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestT6 {

	
	@Test
	public void verityTC_007() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		
		// Enter Name 
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ABC");
		// Enter Email address
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("bug123456@gmail.com");
		// Click on SignUp button
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		Thread.sleep(2000); // 2 sec
		//Verify  - Signup
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Automation Exercise - Signup";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
		//System.out.println(ActualTitle);
		//WebElement EAIelement=driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		//Assert.assertTrue(EAIelement.isDisplayed());
		
		
		
	}
}
