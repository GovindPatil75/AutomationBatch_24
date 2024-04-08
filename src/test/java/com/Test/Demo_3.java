package com.Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo_3 extends BaseClass{

	
	
	@Test
	public void verifyLoginTest_01() {
		System.out.println("Test 01");
		//Email 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		//Password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		
	}
	
	@Test
	public void verifyLoginTest_02() {
		System.out.println("Test 02");
		//Email 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		//Password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		
	}
	
	@Test
	public void verifyLoginTest_03() {
		System.out.println("Test 03");
		//Email 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		//Password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		
	}
	
	
}
