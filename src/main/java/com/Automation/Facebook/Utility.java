package com.Automation.Facebook;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void capturescreenshot(WebDriver driver,String screenshotname) {
		
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;

			File src = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("./Screenshot/"+screenshotname+".png"));
			
			System.out.println("Screenshot taken");
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
