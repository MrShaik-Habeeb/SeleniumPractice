package com.selelniumpracetice.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXathOne {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		// Absolute Xpath
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Shaik");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Habeeb");
		
		//Clear
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).clear();
		
	}

}
