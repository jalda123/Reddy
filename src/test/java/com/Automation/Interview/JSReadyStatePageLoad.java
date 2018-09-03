package com.Automation.Interview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSReadyStatePageLoad {
	
	WebDriver driver;
	@Test
	
	public void pageLoad() {
	
	ExpectedCondition<Boolean> javascriptwait = new ExpectedCondition<Boolean>() {
		
		
		public Boolean apply(WebDriver driver) {
			return ((JavascriptExecutor) driver).executeScript("return document.readystate").equals("complete");
			
		}
	};
	
	try {
		
		System.out.println("waiting for pageLoad....");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(javascriptwait);	
		
	}
   catch(Exception e) {
	   
	 Assert.assertFalse(false, "timeout pageload request is complet");  
   }
}
}
