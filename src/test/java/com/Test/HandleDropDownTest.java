package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// Handle DropDown 
		
		WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select dropDown=new Select(Country);
		
		//dropDown.selectByIndex(10);
		
		//dropDown.selectByValue("BHUTAN");
		
		dropDown.selectByVisibleText("ETHIOPIA");
		
		//DropDown count option  
		
		List<WebElement> Options=dropDown.getOptions();

		int count=Options.size();
		System.out.println(count); // 264
		
		
		for(int i=0;i<count;i++) {
			
			String text=Options.get(i).getText();
			System.out.println(text);
			
			if(text.equals("BHUTAN")) {
				Options.get(i).click();
				break;
			}
		}
		
		
	}

}
