package com.PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	// Encapsulation --
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") 
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']") 
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']") 
	private WebElement LoginBtn;

	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
}
