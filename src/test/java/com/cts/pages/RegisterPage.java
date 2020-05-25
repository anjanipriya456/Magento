package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {


private static By firstNameLocator=By.id("firstname");
private static By lastNameLocator=	By.id("lastname");
private static By emailLocator=By.id("email_address");
private static By countryLocator=By.xpath("//select[@id='country']");
private static By CompanyTypeLocator=By.xpath("//select[@id='customer_company_type']");
private static By roleLocator=By.xpath("//select[@id='customer_individual_role']");
private static By passwordLocator=	By.id("password");
private static By cnfrmpasswordLocator=	By.id("confirmation");
private static By checkLocator=	By.id("agree_terms");
private static By submitLocator=By.id("registerSubmit");


//private static By errorMessageLocator=By.xpath("//span[contains(text(),'Invalid']");


	public static void enterfirstname(WebDriver driver,String firstName)
	{
		driver.findElement(firstNameLocator).sendKeys(firstName);
	}
	public static void enterlastname(WebDriver driver,String lastName)
	{
		driver.findElement(lastNameLocator).sendKeys(lastName);
	}
	public static void enteremail(WebDriver driver,String email)
	{
		driver.findElement(emailLocator).sendKeys(email);
	}
	
	public static void country(WebDriver driver,String country)
	{
	Select selectcountry=new Select(driver.findElement(countryLocator));
	selectcountry.selectByVisibleText(country);
	}
	
	public static void companyType(WebDriver driver,String companyType)
	{
	Select selectcompanyType=new Select(driver.findElement(CompanyTypeLocator));
	selectcompanyType.selectByVisibleText(companyType);
	}
	
	public static void role(WebDriver driver,String role)
	{
	Select selectrole=new Select(driver.findElement(roleLocator));
	selectrole.selectByVisibleText(role);
	}
	
	public static void password(WebDriver driver,String password)
	{
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public static void cnfrmpassword(WebDriver driver,String cnfrmpassword)
	{
		driver.findElement(cnfrmpasswordLocator).sendKeys(cnfrmpassword);
	} 
	
	public static void checkbox(WebDriver driver)
	{
	 WebElement checkEle=driver.findElement(checkLocator);
	 if(!(checkEle.isSelected()))
			 checkEle.click();
	}
	
	public static void submit(WebDriver driver)
	{
		driver.findElement(submitLocator).click();
	}
	
	
}
