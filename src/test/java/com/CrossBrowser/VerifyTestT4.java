package com.CrossBrowser;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTestT4 {

	@Test
	public void verityTC_005() {
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Test step 1");
		System.out.println("Test step 2");
		System.out.println("Test step 3");
		
		String Expecteddata="Test1";
		String Actualdata="ABC1";
		
		soft.assertEquals(Actualdata, Expecteddata); // Fail -- Error
		
		System.out.println("Test step 4");
		System.out.println("Test step 5");
		System.out.println("Test step 6");
		
		soft.assertAll(); //  ommit
		
		
	}
}
