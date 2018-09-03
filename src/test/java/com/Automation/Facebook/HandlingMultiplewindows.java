package com.Automation.Facebook;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
			
			driver.findElement(By.name("link1")).click();
			
			Set<String> all =driver.getWindowHandles();
			
			ArrayList<String> a = new ArrayList<String>(all);
			
			driver.switchTo().window(a.get(1));
			
		String url1=	driver.getCurrentUrl();
		
		System.out.println(url1);

		driver.switchTo().window(a.get(0));
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
			

	}

}
