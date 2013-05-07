package de.stepstone.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import de.stepstone.pages.HomePage;
import de.stepstone.pages.LoginPage;


public class LoginTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(),
			LoginPage.class);
	private HomePage homePage;

	@Test
	public void testLogin() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(admin);
		assertTrue(homePage.isLoggedIn());
		homePage.logout();
		assertTrue(homePage.isLoggedOut());
	}

}
