package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CommereceTest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = driver;
		
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("laptops");
		
		searchBar.sendKeys(Keys.ENTER);
		//WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
		//enter.click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]")).click();
	}

}
