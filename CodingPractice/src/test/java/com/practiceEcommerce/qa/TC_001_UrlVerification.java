package com.practiceEcommerce.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_UrlVerification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ecommercepractice.letskodeit.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//registration page
		
		driver.findElement(By.xpath("//a[@aria-label='Orders']//*[name()='svg']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='create an account']")).click();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abhi");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("don");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhidon780@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
}
