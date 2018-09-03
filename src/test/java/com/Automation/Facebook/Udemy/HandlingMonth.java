package com.Automation.Facebook.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.path2usa.com/travel-companions");
        
        driver.findElement(By.xpath("//input[@id='travel_date']")).click();

	}

}
