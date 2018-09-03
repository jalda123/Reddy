package com.Automation.Facebook;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/satee/Desktop/A.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('t1').value='Jalda'");
		
	//	js.executeScript("document.getElementById('t2').value=''");
		
		js.executeScript("document.getElementById('t2').value='sateesh'");

		
	//	js.executeScript("document.getElementById('t2').type='button'");

		

	}

}
