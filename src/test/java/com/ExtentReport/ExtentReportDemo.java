package com.ExtentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {
	
	WebDriver driver;
	
	ExtentReports extent;
	
	ExtentTest extenttest;
	
	@BeforeTest
	
	public void setxtent() {
		
		
		
    extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Extentreport.html",true);
    
    
		
    
		
	}
	
	@AfterTest
	
	public void endreport() {
		
		extent.flush();
		extent.close();
	}
	
	public static String getscreenshot(WebDriver driver ,String screenshotname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty("user.dir")+"/Screenshot/" +screenshotname+".png";
		
		File finaldestination = new File(destination);
		
		FileUtils.copyFile(source, finaldestination);
		
		return destination;
	}
	
	@BeforeMethod
	
	public void setup() {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	
	}
	
	@Test
	
	public void login() {
		
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	
	public void tearDown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			extenttest.log(LogStatus.FAIL, "Failed Test case"+result.getName());
			extenttest.log(LogStatus.PASS, "Pass The Test Case" +result.getName());
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture("destination"));
			
		}
		
	}
	
	

}
