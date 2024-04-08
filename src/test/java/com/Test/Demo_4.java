package com.Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo_4 extends BaseClass{

	
	@Test
	public void verifyLoginTest_05() {
		System.out.println("Test 05");
		//Email 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		//Password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		
	}
}
