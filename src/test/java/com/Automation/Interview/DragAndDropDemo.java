package com.Automation.Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo {
	
	@Test
	
	public void drag() {
	
	 System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		act.clickAndHold().moveToElement(driver.findElement(By.id(""))).release().build().perform();
	
		

	}
}
