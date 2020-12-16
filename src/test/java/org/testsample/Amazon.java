package org.testsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	@Test
	private void viewProduct() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Nikon camera");
		
		WebElement btnclick = driver.findElement(By.id("nav-search-submit-text"));
		btnclick.click();
		
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		
		for (WebElement list : product) {
			System.out.println(list.getText());
			
		}
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (WebElement listprice : price) {
			
			System.out.println(listprice.getText());
			
		}
			
			
				
			
			
		}
		
		

	}


