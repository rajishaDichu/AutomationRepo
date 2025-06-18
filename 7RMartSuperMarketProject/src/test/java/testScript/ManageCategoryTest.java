package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.PageUtility;

public class ManageCategoryTest extends Base {

	@Test(description = "Verify whether the user can add new category")
	public void verifywhetherUserIsAbleToAddNewCategory() throws IOException {
		HomePage homepage;
		ManageCategoryPage managepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSubmit();
        managepage=homepage.clickOnManageCategory().clickOnNewButton();
		// managecategory.clickCategoryfield();
		String categoryname = ExcelUtility.getStringData(1, 0, "ManageCategoryPage");
		managepage.enterCategory(categoryname).discountSelect().choosefile().applywait().radioButton1()
		.radioButton2().pageScroll().clickOnSave();//.applywait()
		boolean isaddcategorydisplayed=managepage.addcategory();
		Assert.assertTrue(isaddcategorydisplayed, Messages.UNABLETOADDCATEGORYERROR);
	}

}
