package com.Automation.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
		
		Thread.sleep(3000);
		
		ele.click();
		
		String value =ele.getText();
		
		System.out.println(value);
		
		String value1 = ele.getAttribute("title");
		
		System.out.println(value1);
		
		
		
		
		
		


	}

}
