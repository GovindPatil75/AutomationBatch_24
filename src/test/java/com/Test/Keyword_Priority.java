package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keyword_Priority {

	
	@Test(priority=1)
	public void xyz() {
		
		System.out.println("Test xyz");
	}
	
	@Test(priority=-3,enabled=false)
	public void pqr() {
		
		System.out.println("Test pqr");
	}
	
	@Test(priority=0,invocationCount=2)
	public void abc() {
		
		System.out.println("Test abc");
	}
	
	@Test()
	public void rts() {
		
		System.out.println("Test rts");
		Assert.assertTrue(true); //fail -pass
	}
	
	@Test(dependsOnMethods="rts")
	public void ytr() {
		
		System.out.println("Test ytr");
	}
	
	
	
	
	
	
	
}
