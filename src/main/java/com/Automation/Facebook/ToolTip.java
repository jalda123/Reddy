package com.Automation.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		WebElement tooltip =driver.findElement(By.xpath("//a[text()='Projects']"));
		
		String msg = tooltip.getAttribute("title");
		
		System.out.println(msg);
	

	}

}
