package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);

		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		// Email ---Shift --down --- test ---Shift --UP == TEST
		act.keyDown(Email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		
		// ctrl +a = data select
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//ctrl +c = copy the data
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Element =click
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		
		//ctrl +V = paste the data
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
