package com.Automation.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "E:\\Software\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/selenium-webdriver/challenges-to-run-selenium-scripts-with-ie-browser/");

	}

}
