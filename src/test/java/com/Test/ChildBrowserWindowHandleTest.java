package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserWindowHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String ParentWindowID=driver.getWindowHandle(); // Parent window ID
		System.out.println(ParentWindowID);
		
		Set<String> AllId=driver.getWindowHandles(); // Parent +Child Window ID
        System.out.println(AllId);
        
        List<String> list=new ArrayList<String>(AllId);
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        // switch child browser window 
        driver.switchTo().window(list.get(1));
        
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
        
        //driver.close(); // Browser current window 
        
       // driver.quit(); // Current window + All open window close 
        
        // Parent window switch 
        driver.switchTo().window(ParentWindowID);
        
        
	}

}
