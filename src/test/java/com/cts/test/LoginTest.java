package com.cts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.MainPage;


public class LoginTest extends LaunchWebDriver{

	@DataProvider
	public void InvalidCredentialData()// annotation can't control the static methods
	{

		HomePage.clickOnMyAccount(driver);

		// driver.findElement(By.className("icon")).click();

		LoginPage.enterUserName(driver, "anju456@gmail.com");

		LoginPage.enterPassword(driver, "anju@123");

		LoginPage.clickOnLogin(driver);
		// My account click

		String actualErrorMessage = LoginPage.errorMessage(driver);

		String expectedError = "Invalid login or password";

		// boolean checkInvalid=actualError.getText("Invalid");
		Assert.assertTrue(actualErrorMessage.contains("Invalid login or password"), "Assert on invalidCredentialTest");//
	}

	@Test
	public void validCredentialTest() {

		HomePage.clickOnMyAccount(driver);

		// enter username
		LoginPage.enterUserName(driver, "balaji0017gmail.com");

		// enter password
		LoginPage.enterPassword(driver, "welcome@123");

		// login click
		LoginPage.clickOnLogin(driver);

		MainPage.waitForLogoutPresence(driver);

		String actualValue = MainPage.getCurrentTitle(driver);

		String expectedTitle = "My Account";

		Assert.assertEquals(actualValue, expectedTitle, "Assert on validCredentialTest");// Check character by character
																							// from both the actual and
																							// expected

		// logout
		MainPage.logOutClick(driver);

	}

}
