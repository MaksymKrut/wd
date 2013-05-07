package de.stepstone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import de.spepstone.data.UserData;
import de.stepstone.utils.ConfigProperties;

public class LoginPage extends Page {

	@FindBy(linkText = "Register now!")
	public WebElement linkSignIn;
	
	@FindBy(xpath = "//*[@id='loginUserLogin']")
	public WebElement fieldUsername;

	@FindBy(xpath = "//*[@id='loginUserPassword']")
	public WebElement fieldPassword;

	@FindBy(xpath = "//*[@id='loginButton']")
	public WebElement buttonLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public HomePage loginAs(UserData admin) {
		linkSignIn.click();
		type(fieldUsername, admin.name);
		type(fieldPassword, admin.password);
		buttonLogin.click();
		return PageFactory.initElements(driver, HomePage.class);
	}

	@Override
	public void open() {
		driver.get(ConfigProperties.getProperty("login.url"));
	}
	

}
