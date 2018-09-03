package com.Automation.Interview;

import org.testng.annotations.Test;

public class Groups1 {

	@Test(groups= {"smoke"})
	
	public void test1() {
		System.out.println("Test 1");
	}
	
@Test(groups= {"sanity"})
	
	public void test2() {
		System.out.println("Test 2");
	}

@Test(groups= {"smoke"})

public void test3() {
	System.out.println("Test 3");
}

@Test(groups= {"functional"})

public void test4() {
	System.out.println("Test 4");
}
}
