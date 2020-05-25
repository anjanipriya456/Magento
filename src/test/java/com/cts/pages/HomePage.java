package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
private static By myAccLocator=(By.xpath("//a[@data-adobe-name='Header|GlobalNav|MyAccountClick']"));
	
	public static void clickOnMyAccount(WebDriver driver)
	{
		driver.findElement(myAccLocator).click();
	}
	
}
