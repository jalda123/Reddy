package com.Automation.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*WebElement hidden = driver.findElement(By.id("male"));
		
		Thread.sleep(3000);
		
		js.executeScript("document.getElementByxpath('male');");//it is not woriking
*/		
		String titlepage = (String)js.executeScript("return document.title");
		
		System.out.println(titlepage);
		
		String url = (String)js.executeScript("return document.currentUrl");
		
		System.out.println(url);
	
	}

}
