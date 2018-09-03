
package com.Automation.Facebook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Securewindow {
	
	private static ChromeDriver driver;
	
	public static void main(String[] args) {
		
		/*DesiredCapabilities capability = DesiredCapabilities.chrome();
		// To Accept SSL certificate
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		*/// setting system property for Chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		// create Google Chrome instance and maximize it
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cacert.org/");
		
		
		
	
	}

}
