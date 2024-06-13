package com.selelniumpracetice.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIdNameTagName {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Shaik");
		driver.findElement(By.name("pass")).sendKeys("Habeeb");
		driver.findElement(By.name("login")).click();
		
		//int links=driver.findElements(By.tagName("div")).size();
		//System.out.println(links);

	}

}
