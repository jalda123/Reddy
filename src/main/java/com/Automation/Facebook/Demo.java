package com.Automation.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.id("email"));
		
		ele.sendKeys("");
		
		ele.clear();
		
		
		
		
		
		driver.findElement(By.id("pass")).sendKeys("jalda12345");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();
		
		

	}

}
