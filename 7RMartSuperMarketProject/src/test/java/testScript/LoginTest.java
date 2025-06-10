package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "Verify whether the user can log in with valid credentials",priority=1)
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		boolean isdashboarddisplayed=loginpage.dashboardtileDisplayed();
		//Assert.assertTrue(isdashboarddisplayed, "User was unable to login with valid credentials");
		String expected="Dashboard";
		String actual=loginpage.getdashboardtext();
		Assert.assertEquals(actual,expected,"User was unable to login with valid credentials");
	}

	@Test(description = "Verify whether the user can log in with valid username and invalid password",priority=2)
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		boolean isdashboarddisplayed=loginpage.dashboardtileDisplayed();
		Assert.assertFalse(isdashboarddisplayed, "User was able to login with invalid password");
		
	}

	@Test(description = "Verify whether the user can log in with invalid username and valid password",priority=3)
	public void verifyUserLoginWithInValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		boolean isalertdisplayed=loginpage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed, "User was able to login with invalid username");
	}

	@Test(description = "Verify whether the user can log in with invalid credentials",priority=4)
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		boolean isalertdisplayed=loginpage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed, "User was able to login with invalid credential");
	}

}
