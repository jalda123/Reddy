package com.Automation.Facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	WebDriver driver;

	@Test
	
	public void capture() throws IOException {
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//a[@id='emai']")).sendKeys("Jalda");
			
		}
		catch(Exception e) {
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			
		File src =	ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("./Screenshot/Google.png"));
			
			
			
		}
	}
	
}
