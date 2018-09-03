package com.Automation.Facebook;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	@BeforeSuite
	
	public void suite() {
		System.out.println("suite");
	}
	
	@BeforeClass
	public void clas() {
		System.out.println("Beforeclass class");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	
	@Test
	
	public void test() {
		System.out.println("Test");
	}

}
