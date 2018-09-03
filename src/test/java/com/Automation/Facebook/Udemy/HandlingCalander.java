package com.Automation.Facebook.Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.path2usa.com/travel-companions");

driver.findElement(By.name("travel_date")).click();

Thread.sleep(3000);

//grab the comman attribute put into list and iterate

 List<WebElement> ele =driver.findElements(By.cssSelector(".day"));
 
int count = ele.size();
 
 for(int i=0;i<count;i++) {
	 
	WebElement day =  ele.get(i);
	
	String name = day.getText();
	
	if(name.equalsIgnoreCase("20")) {
		Thread.sleep(3000);

		day.click();
		break;
	}
	
	
 }

	}

}


