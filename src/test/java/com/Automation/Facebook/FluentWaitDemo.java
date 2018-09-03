package com.Automation.Facebook;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		/*boolean status =driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();
		
		if(status) {
			System.out.println("Test case is pass");
		}*/
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement foo =wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				WebElement ele =driver.findElement(By.xpath("//p[@id='demo']"));
				String value =ele.getAttribute("innerHTML");
				
				if(value.equalsIgnoreCase("webdriver")) {
					return ele;
				}
				else {
					return null;
				}
			}
			
		});
		
		System.out.println(foo.isDisplayed());
	
				

	}

}
