package com.Automation.Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		int count = all.size();
		
		for(int i=0;i<count;i++) {
			
			WebElement ele =all.get(i);
			
			String name = ele.getAttribute("value");
			System.out.println(name);
			
			if(name.equalsIgnoreCase("ruby")) {
				ele.click();
			}
		}

	}

}
