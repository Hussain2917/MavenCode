package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Sample extends Base {
	public Sample() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	@FindBy(xpath= "//span[text()='Boys']")
	private WebElement category;

}
