package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		// Alert handle
		//customer id -- enter
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345678");
		
		// click submit button 
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// Alert
		
		String text=Library.getAlertHandle(driver).getText();
		System.out.println(text);
		Library.getAlertHandle(driver).accept();
		
		String text2=Library.getAlertHandle(driver).getText();
		System.out.println(text2);
		
		Library.getAlertHandle(driver).accept();

	}

}
