package com.Automation.Interview;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount=10)
	
	public void test1() {
		
		System.out.println("Hello");
	}


@Test(dependsOnGroups="smoke")

public void test2() {
	System.out.println("Depends on group");
}
}