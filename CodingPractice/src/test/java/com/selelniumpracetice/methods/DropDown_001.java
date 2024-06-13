package com.selelniumpracetice.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement CourseDropDown = driver.findElement(By.id("course"));
		Select DropDown = new Select(CourseDropDown);
		
		DropDown.selectByIndex(2);
		
		DropDown.selectByValue("java");
		
		DropDown.selectByVisibleText("Python");
		
		String Selected = DropDown.getFirstSelectedOption().getText();
		System.out.println(Selected);
	}

}
