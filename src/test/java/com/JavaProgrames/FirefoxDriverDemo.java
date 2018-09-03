package com.JavaProgrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxDriverDemo {
	
	@Test
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\gecko\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}

}
