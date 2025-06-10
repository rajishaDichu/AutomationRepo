package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(description = "Verify whether the user can add new category")
	public void verifywhetherUserIsAbleToAddNewCategory() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
		ManageCategoryPage managecategory = new ManageCategoryPage(driver);
		managecategory.clickOnManageCategory();
		managecategory.clickOnNewButton();
		// managecategory.clickCategoryfield();
		String categoryname = ExcelUtility.getStringData(1, 0, "ManageCategoryPage");
		managecategory.enterCategory(categoryname);
		managecategory.discountSelect();
		managecategory.choosefile();
		managecategory.showOnTop();
		managecategory.showOnLeft();
		managecategory.clickOnSave();
		String expected="Add Category";
		String actual=managecategory.addcategory();
		Assert.assertEquals(actual,expected,"User is unable to add new category");

	}

}
