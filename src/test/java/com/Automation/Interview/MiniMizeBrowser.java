package com.Automation.Interview;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiniMizeBrowser {
	
	@Test
	
	public void mini() throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.manage().window().setPosition(new Point(0 ,-1000));
			
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
	}

}
