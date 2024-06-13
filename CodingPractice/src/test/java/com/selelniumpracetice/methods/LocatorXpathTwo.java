package com.selelniumpracetice.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathTwo {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Habeeb");
		driver.findElement(By.xpath("input[type='password']")).sendKeys("shaik");
		
	}

}
