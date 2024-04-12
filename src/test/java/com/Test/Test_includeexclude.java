package com.Test;

import org.testng.annotations.Test;

public class Test_includeexclude {

	@Test
	public void r1() {
		System.out.println("Test r1");
	}
	
	@Test
	public void r2() {
		System.out.println("Test r2");
	}
	
	@Test(timeOut=1000)
	public void r3() throws InterruptedException {
		System.out.println("Test r3");
		Thread.sleep(3000); //  3 sec
	}
	
}
