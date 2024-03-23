package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=driver;
		
		// pixel
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000); // 5 sec
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(5000); // 5 sec
		// Element 
		
		WebElement Submit=driver.findElement(By.xpath("//input[@name='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", Submit);
		
		Library.scrolltoElement(driver, Submit);
	
	}

	
}
