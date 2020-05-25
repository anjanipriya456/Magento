package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
	

	private static By logoutLocator = By.linkText("Log Out");


	public static void waitForLogoutPresence(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(logoutLocator));
	}
	
	public static String getCurrentTitle(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	
	public static void logOutClick(WebDriver driver)
	{
		driver.findElement(logoutLocator).click();
	}
	}
