package com.Test;

import org.testng.annotations.Test;

public class groupsconcepts_1 {

	
	@Test(groups= {"Critical Regression","Regression"})
	public void p1() {
		System.out.println("Test P1");
	}
	
	@Test(groups= {"Sanity"})
	public void p2() {
		System.out.println("Test P2");
	}
	
	@Test(groups= {"Regression"})
	public void p3() {
		System.out.println("Test P3");
	}
}
