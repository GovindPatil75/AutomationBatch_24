package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_2 {

	//BS-BT-BC-BM -Test -AM -AC-AT-AS
	
	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
		
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method - Browser Open");
	}
	
	@Test
	public void verifyTest001() {
	
		System.out.println("Test 001");
	}
	
	@Test
	public void verifyTest002() {
	
		System.out.println("Test 002");
	}
	
	@Test
	public void verifyTest003() {
	
		System.out.println("Test 003");
	}
	
	
	@AfterMethod
	public void AM() {
		System.out.println("After method - Browser window close");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}
}
