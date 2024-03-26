package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//
		Actions act=new Actions(driver);
		WebElement RCE=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement Quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		 
		// right click +Option click
		//act.contextClick(RCE).click(Quit).build().perform();
		
		
		WebElement DoubleClickEle=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
         //double click 
		act.doubleClick(DoubleClickEle).build().perform();
	}

}
