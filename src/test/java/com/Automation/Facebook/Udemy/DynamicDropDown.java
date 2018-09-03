package com.Automation.Facebook.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[@value='HYD']")).click(); //it is not click why becz developer wrote code two dropdowns same code use
		
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr[4]/td[4]")).click();


		

	}

}
