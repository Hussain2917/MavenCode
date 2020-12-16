package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	 
	@Test(groups= {"1st"})
	private void method1() {
		System.out.println("hi");

	}
	
	@Test
	private void method2() {
		System.out.println("how r u");

	}
	
	@Test
	private void method3() {
		System.out.println("what about you");

	}
	
	@Test
	private void method4() {
		System.out.println("fine");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	private void loginPage(String user, String pass) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(pass);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
}
*/	
	

}
