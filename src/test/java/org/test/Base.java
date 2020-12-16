package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	protected static WebDriver driver;
	//launch browser--1
		public static WebDriver launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAJAHAN SHEIK\\eclipse-workspace\\Baseclass\\driver\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			return driver;
	}
		//load url--2
		
		public void geturl(WebDriver driver, String url) {
			driver.get(url);
	}
		// maximize window--3
		public void maximize(WebDriver driver) {
			driver.manage().window().maximize();
	}
		// sendkeys method--4
		public void sendtext(WebElement element, String text) {
			element.sendKeys(text);
	}
		//button click--5
		public void click(WebElement element) {
			element.click();
	}

}
