package com.Automation.Interview;

import org.testng.annotations.Test;

public class Groups2 {
	
@Test(groups= {"smoke"})
	
	public void test1() {
		System.out.println("Test 1 gp");
	}
	
@Test(groups= {"sanity"})
	
	public void test2() {
		System.out.println("Test 2 gp");
	}


}
