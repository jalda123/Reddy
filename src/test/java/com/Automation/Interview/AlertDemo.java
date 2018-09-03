package com.Automation.Interview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	
	@Test
	
	public void alertdemo() {
		
		WebDriver driver = new ChromeDriver();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		alert.getText();
	}

}
