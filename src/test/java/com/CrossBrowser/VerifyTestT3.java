package com.CrossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestT3 {

	
	@Test
	public void verifyTC_004() {
		
		System.out.println("Valid Email ID");
		System.out.println("Valid Password");
		
		System.out.println("click On login Button ");
		
		// Verify Homepage 
		String ExpectedTitle="ABC";
		
		
		String ActualTitle="pqr" ; //driver.gettitle(); // current webpage title
	
	    Assert.assertEquals(ActualTitle, ExpectedTitle); //Fail
	    
	    System.out.println("Test step 25");
	    System.out.println("Test step 26");
	    
	}
}
