package com.Automation.Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ISDisplayDemo {
	
	WebDriver driver;
	
	public boolean demo() {
	try {
		
		driver.findElement(By.xpath("")).isDisplayed();
		
		return true;
		
	}
	
	catch(Exception e) {
		
		return false;
	}
	
	}

}
