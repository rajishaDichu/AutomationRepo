package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test(description = "Verify whether the user can add a new user",retryAnalyzer=retry.Retry.class)
	public void verifyWhetherUserIsAbleToAddNewAdminUser() throws IOException {
		HomePage homepage;
		AdminUsersPage adminpage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSubmit();	
		adminpage=homepage.clickOnAdminUsers();
		adminpage.clickOnNewButton();
		FakerUtility fakerutility = new FakerUtility();
		String username1 = fakerutility.createRandomUsername();
		adminpage.enterUsername(username1);
		String password1 = fakerutility.createRandomPassword();
		adminpage.enterPassword(password1).selectUserType().clickOnSave();
		boolean isuseraddedalertdisplayed = adminpage.userAdded();
		Assert.assertTrue(isuseraddedalertdisplayed, Messages.UNABLETOADDNEWUSERERROR);
	}

	@Test(description = "Verify whether the user can search for a user")
	public void verifyWhetherUserIsAbleToSearchForAUser() throws IOException {
		HomePage homepage;
		AdminUsersPage adminpage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSubmit();
		adminpage=homepage.clickOnAdminUsers();
		adminpage.clickOnSearch();
		String user = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		adminpage.enterUserSearch(user).enterUserTypeSearch().enterSearch();
		String expected = "Admin Users";
		String actual = adminpage.usersearchpage();
		Assert.assertEquals(actual, expected, Messages.UNABLETOSEARCHUSERERROR);
	}
}
