package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Scenario 1
		WebElement Frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(Frame1); // Mainpage ---Frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");
		
		driver.switchTo().defaultContent(); // frame1 --Mainpage
		
		driver.switchTo().frame(1); //Mainpage --- frame2
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test");
		
		driver.switchTo().defaultContent(); // frame2 --Mainpage
		
		//Scenario 2 : Mainpage -frame 3 --inneriframe
		
		driver.switchTo().frame(2) ;// Mainpage ---frame 3
		WebElement inneriframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(inneriframe); // frame 3 --inneriframe
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
		
		//
		driver.switchTo().parentFrame(); // inneriframe--frame 3
		driver.switchTo().defaultContent(); // frame 3 ---mainpage
		

	}

}
