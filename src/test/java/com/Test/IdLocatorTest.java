package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdLocatorTest {

	public static void main(String[] args) {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// ELement - ID -Locator 
		
		WebElement EmailId=driver.findElement(By.id("email"));
		EmailId.sendKeys("Test@gmail.com");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("12345678");
		
		WebElement loginBtn=driver.findElement(By.id("u_0_5_zK"));
		loginBtn.click();
	}

}
