package com.Automation.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownVisisbilityOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,1000)");
		
		WebElement ele =driver.findElement(By.xpath("//a[text()='Linux']"));
		
		int x = ele.getLocation().getX();
		
		int y =ele.getLocation().getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
	

	}

}
