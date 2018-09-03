package com.Automation.Facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreesnshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/guru99home/");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
		File src =	ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("./Screenshot/A.png"));
		

	}

}
