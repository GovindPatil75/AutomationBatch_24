package com.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowsetwindowHandleTest_2 {

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
        
        Iterator<String> It=AllId.iterator();
        
         while(It.hasNext()) {
        	 
        	 String WindowID=It.next();
        	 
        	 if(!ParentWindowID.equals(WindowID)) {
        		 
        		 driver.switchTo().window(WindowID);
        	 }
         }
        
	}

}
