package com.selelniumpracetice.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoactorLinkTextAndPartialLinkText {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=61665929249&hvpone=&hvptwo=&hvadid=486445347800&hvpos=&hvnetw=g&hvrand=7138886288968286798&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-298441375321&hydadcr=5621_2175698&gclid=EAIaIQobChMI8rX-7Mif8wIV-ZlmAh2xyA5KEAAYASAAEgJnefD_BwE");

	//	int sliders=driver.findElements(By.className("")).size();   // not working
		//System.out.println(sliders);

		driver.findElement(By.linkText("Mobiles")).click();
	   driver.findElement(By.partialLinkText("Basic Mobiles")).click();
		
	}

}
