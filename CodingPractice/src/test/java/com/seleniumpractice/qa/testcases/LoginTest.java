package com.seleniumpractice.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest {

	public WebDriver driver;
	@BeforeMethod
	public void setup() {
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
