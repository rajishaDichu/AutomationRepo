package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "Verify whether the user can log in with valid credentials",priority=1,groups= {"smoke"})
	public void verifyUserLoginWithValidCredentials() throws IOException {
		HomePage homepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSubmit();
		boolean isdashboarddisplayed=loginpage.dashboardtileDisplayed();
		//Assert.assertTrue(isdashboarddisplayed, "User was unable to login with valid credentials");
		String expected="Dashboard";
		String actual=loginpage.getdashboardtext();
		Assert.assertEquals(actual,expected,Messages.VALIDCREDENTIALERROR);
	}

	@Test(description = "Verify whether the user can log in with valid username and invalid password",priority=2)
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSubmit();
		//boolean isdashboarddisplayed=loginpage.dashboardtileDisplayed();
		//Assert.assertFalse(isdashboarddisplayed, Messages.INVALIDPASSWORDERROR);
		boolean isalertdisplayed=loginpage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed, Messages.INVALIDPASSWORDERROR);
		
	}

	@Test(description = "Verify whether the user can log in with invalid username and valid password",priority=3)
	public void verifyUserLoginWithInValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSubmit();
		boolean isalertdisplayed=loginpage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed, Messages.INVALIDUSERNAMEERROR);
	}

	@Test(description = "Verify whether the user can log in with invalid credentials",priority=4,groups= {"smoke"},dataProvider = "logindata")
	public void verifyUserLoginWithInvalidCredentials(String username, String password) throws IOException {
		//String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		//String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSubmit();
		boolean isalertdisplayed=loginpage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed, Messages.INVALIDCREDENTIALERROR);
	}

	@DataProvider(name="logindata")
	public Object [][]  getDataFromDataProvider() throws IOException
	{
		return new Object[][] {new Object[] {"test","test1"},new Object[] {"test1","test2"},
		new Object[] {ExcelUtility.getStringData(3, 0,"loginpage"),ExcelUtility.getStringData(3,1 ,"loginpage")}
	};
	}
}
