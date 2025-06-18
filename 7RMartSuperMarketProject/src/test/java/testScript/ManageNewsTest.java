package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(description = "Verify whether the user can add new news")
	public void verifyWhetherUserIsAbleToAddNewNews() throws IOException {
		HomePage homepage;
		ManageNewsPage newspage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSubmit();
		
		newspage=homepage.clickManageNews().clickNewButton();
		String newsdata = ExcelUtility.getStringData(0, 0, "AddNewsPage");
		newspage.newNewsField(newsdata).clickSave();
		boolean isnewsaddedalertdisplayed=newspage.newsaddedmessage();
		Assert.assertTrue(isnewsaddedalertdisplayed,Messages.UNABLETOADDNEWSERROR );
	}

	@Test(description = "Verify whether the user can search for a news")
	public void verifyWhetherUserIsAbleToSearchAddedNews() throws IOException {
		HomePage homepage;
		ManageNewsPage newspage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSubmit();
		newspage=homepage.clickManageNews().clickSearchNews();
		String searchnews = ExcelUtility.getStringData(0, 0, "AddNewsPage");
		newspage.searchNewsFiled(searchnews).searchsubmit();
		boolean ismanagenewstitledisplayed=newspage.searchnewspage();
		Assert.assertTrue(ismanagenewstitledisplayed, Messages.UNABLETOSEARCHNEWSERROR);
	}

}
