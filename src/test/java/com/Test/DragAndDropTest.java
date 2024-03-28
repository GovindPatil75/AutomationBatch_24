package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// WebElement -- srcElement ---targetElement
		
		WebElement srcElement=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement targetElement=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		
		Actions act=new Actions(driver);
		act.dragAndDrop(srcElement, targetElement).build().perform();
		
	}

}
