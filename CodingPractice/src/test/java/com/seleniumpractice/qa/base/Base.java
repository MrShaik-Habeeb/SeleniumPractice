package com.seleniumpractice.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Base {
	WebDriver driver;
	
	
	public WebDriver initializeBrowserAndOpenApplicationURL(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else 
			if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
	}else 
		if(browserName.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}else 
		if(browserName.equalsIgnoreCase("edge")) {
		driver = new SafariDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.get("https://www.facebook.com");
		return driver;
}
	}

