package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

private static By userLocator=By.id("email");
private static By passLocator=	By.name("login[password]");
private static By loginLocator=By.xpath("//span[text()='Login'");
private static By myAccLocator=(By.xpath("//span[text()='Register']"));
private static By getTextLoc =By.xpath("//li[@class='error-msg']");
//private static By errorMessageLocator=By.xpath("//span[contains(text(),'Invalid']");


	public static void enterUserName(WebDriver driver,String username)
	{
		driver.findElement(userLocator).sendKeys(username);
	}
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(passLocator).sendKeys(password);
	}
	public static void clickOnLogin(WebDriver driver)
	{
		driver.findElement(loginLocator).click();
	}
	public static void clickOnMyAccountIcon(WebDriver driver)
	{
		driver.findElement(myAccLocator).click();
	}
	public static String errorMessage(WebDriver driver)
	{
		String actualError=driver.findElement(getTextLoc).getText();
		return actualError;
	}
	 }
	
