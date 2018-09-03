package com.Automation.Facebook;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownVisibilityOfElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;

		
		WebElement ele =driver.findElement(By.xpath("//a[text()='Linux']"));
		
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		Thread.sleep(3000);

		
	//	js.executeScript("window.scrollBy(0,-1000)");
		
		


	}

}
