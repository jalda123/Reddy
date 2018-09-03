package com.Automation.Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HiddenElemnt {

		// TODO Auto-generated method stub
	WebDriver driver;
	
	@Test
	
	public void hidden()
	{		

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		//driver.findElement(By.id("male")).click(); //this is hidden Element
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.id("male"));
		
		//js.executeScript("document.getElementsByid('male').click();");
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click();", element);*/
		
		/*String script = "javascript:document.getElementById('male').click();";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript(script);
		*/
		//This is my Own Trial
		
	//	driver.findElement(By.xpath("(//input[@id='male'])[2]")).click(); it is work
		
		List<WebElement> radio = driver.findElements(By.id("male"));
		
		int count = radio.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement ele =radio.get(i);
			
			int x =ele.getLocation().getX();
			
			System.out.println(x);
			
			if(x!=0) {
				ele.click();
				break;
			}
		}


	}
	
	@AfterTest
	
	public void end(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
	
			Utility.capturescreenshot(driver, result.getName());
		}
		
		
	}

}
