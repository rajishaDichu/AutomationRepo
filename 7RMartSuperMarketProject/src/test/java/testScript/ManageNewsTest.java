package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(description = "Verify whether the user can add new news")
	public void verifyWhetherUserIsAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		ManageNewsPage news = new ManageNewsPage(driver);
		news.clickManageNews();
		news.clickNewButton();
		String newsdata = ExcelUtility.getStringData(0, 0, "AddNewsPage");
		news.newNewsField(newsdata);
		news.clickSave();
		boolean isnewsaddedalertdisplayed=news.newsaddedmessage();
		Assert.assertTrue(isnewsaddedalertdisplayed,Messages.UNABLETOADDNEWSERROR );
	}

	@Test(description = "Verify whether the user can search for a news")
	public void verifyWhetherUserIsAbleToSearchAddedNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		ManageNewsPage news = new ManageNewsPage(driver);
		news.clickSearchNews();
		String searchnews = ExcelUtility.getStringData(0, 0, "AddNewsPage");
		news.searchNewsFiled(searchnews);
		news.searchsubmit();
		boolean ismanagenewstitledisplayed=news.searchnewspage();
		Assert.assertTrue(ismanagenewstitledisplayed, Messages.UNABLETOSEARCHNEWSERROR);
	}

}
