package com.cts.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class LaunchWebDriver {

	public WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(@Optional("ch") String browserName)
	{

	if(browserName.equalsIgnoreCase("ff"))
	{
		System.setProperty("webdriver.ff.driver", "src/test/resources/driver/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "src/test/resources/driver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else 
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://magento.com/");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
