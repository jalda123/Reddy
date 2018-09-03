package com.Automation.Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Functions;

public class FluentWaitDemo {

	@Test
	
	public void fluent() {
		
		WebDriver driver = null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element =wait.until(new Function<WebDriver,WebElement>()
				{
				
				public WebElement apply(WebDriver driver) {
					
					return driver.findElement(By.xpath(""));
			
		}

			 	
				}		);
				
				
	}
}
