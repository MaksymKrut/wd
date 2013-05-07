package com.wakedocuments.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


import com.wakedocuments.data.UserData;
import com.wakedocuments.ConfigProperties;

public class BasicTestCase {

	protected static WebDriver driver;
	
	public UserData admin = new UserData("maximkrut@gmail.com", "temppassword");

	protected WebDriver getWebDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		}
		return driver;
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
}
