package com.Automation.Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowmanyLinks {
	
	@Test
	
	public void howmanylinkspresent() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/selenium-tutorial/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count =links.size();
		
		System.out.println(count);
		
		for(int i=1;i<count;i++) {
			
			System.out.println(links.get(i).getText());
		}

	}

}
