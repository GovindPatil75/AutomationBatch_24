package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest_1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// 
		Actions act=new Actions(driver);
		
		WebElement FP=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//Mouse Hover +Click
		act.moveToElement(FP).click().build().perform();
		
		

	}

}
