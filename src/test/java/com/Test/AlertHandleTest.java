package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	public static void main(String[] args) throws Exception {
		
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

		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		
		// click on cancel button
		//alt.dismiss();
		
		//click ok button
		alt.accept();
		
		Thread.sleep(5000);
		
		String text2=alt.getText();
		System.out.println(text2);
		
		alt.accept();
		
		//sendkeys
		//alt.sendKeys("test");
	}

}
