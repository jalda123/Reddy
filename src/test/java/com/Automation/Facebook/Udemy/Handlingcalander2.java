package com.Automation.Facebook.Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcalander2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.path2usa.com/travel-companions");

driver.manage().window().maximize();

Thread.sleep(3000);


driver.findElement(By.name("travel_date")).click();

Thread.sleep(3000);

while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Jul")) {
	
driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
}

Thread.sleep(3000);

List<WebElement> ele = driver.findElements(By.className("day"));

int count = ele.size();

for(int i=0;i<count;i++) {
	
	WebElement days = ele.get(i);
	
	if(days.equals("16")) {
		days.click();
	}
}

	}
}
