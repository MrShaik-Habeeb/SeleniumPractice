package com.selelniumpracetice.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssSelectors {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// 1 Tag & ID
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abhi");   //method 1   Working
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc");        //method 2    working
		
		// 2 Tag & Class
		
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("12345");//method 1  Not Working
		//driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("12345"); //method 2    Not Working
		
		// 3 Tag & attribute
		
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abcd"); //Method 1    Working
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("abcd"); //Method 2    Working
		
		// 4 Tag, class & Attribute
		
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi[data-testid]")).sendKeys("56789"); //Not Working
		//driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi[data-testid]")).sendKeys("56789");   // Not Working
	}

}
