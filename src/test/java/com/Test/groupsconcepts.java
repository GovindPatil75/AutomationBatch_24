package com.Test;

import org.testng.annotations.Test;

public class groupsconcepts {

	
	@Test(groups= {"Regression"})
	public void m1() {
		System.out.println("Test m1");
	}
	
	@Test(groups= {"Critical Regression","Regression"})
	public void m2() {
		System.out.println("Test m2");
	}
	
	@Test(groups= {"Sanity"})
	public void m3() {
		System.out.println("Test m3");
	}
	
	@Test(groups= {"Regression"})
	public void m4() {
		System.out.println("Test m4");
	}
}
