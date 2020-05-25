package com.cts.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.RegisterPage;
import com.cts.utils.ExcelUtils;


public class RegisterTest extends LaunchWebDriver{


	@DataProvider
	public String[][] RegisterData() throws IOException {
		String[][] main = ExcelUtils.getSheetIntoStringArray("src/test/resources/resources/MagentoData.xlsx", "Register");
		return main;
	}

	@Test(dataProvider = "RegisterData")
	public void registrationTest(String firstname,String lastname,String email,String country,String companyType,
			String role,String password,String cnfrmpassword)
	{
		//click on register
  HomePage.clickOnMyAccount(driver);
  
  //clcik on register
  LoginPage.clickOnMyAccountIcon(driver);
  //enter firstname
   
   RegisterPage.enterfirstname(driver, firstname);
   
   
   //enter lastname
	RegisterPage.enterlastname(driver, lastname);
	 
	 //enter email
	RegisterPage.enteremail(driver, email);
	
	//select country
	RegisterPage.country(driver, country);
	//select company type
	RegisterPage.companyType(driver, companyType);
	
	
	//select role
	RegisterPage.role(driver,role);
	
	
	
	//select password
	RegisterPage.password(driver, password);
	
	//confirm password
 RegisterPage.cnfrmpassword(driver,cnfrmpassword);
 
 //checkbox
 RegisterPage.checkbox(driver);
 
 //sumit
 RegisterPage.submit(driver);
	}
	
}
