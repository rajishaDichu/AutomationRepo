package testScript;

import java.io.IOException;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{

	
	@Test
	public void verifyWhetherUserIsAbleToAddNewAdminUser() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		AdminUsersPage adminpage=new AdminUsersPage(driver);
		adminpage.clickOnAdminUsers();
		adminpage.clickOnNewButton();
		adminpage.enterUsername();
		adminpage.enterPassword();
		adminpage.selectUserType();
		adminpage.clickOnSave();
	}
	@Test
	public void verifyWhetherUserIsAbleToSearchForAUser() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		AdminUsersPage adminpage=new AdminUsersPage(driver);
		adminpage.clickOnAdminUsers();
		adminpage.clickOnSearch();
		String user=ExcelUtility.getStringData(0, 0, "AdminUserPage");
		adminpage.enterUserSearch(user);
		adminpage.enterUserTypeSearch();
		adminpage.enterSearch();
	}
}
