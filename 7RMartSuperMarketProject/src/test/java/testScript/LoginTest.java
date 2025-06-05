package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test (description = "Verify whether the user can log in with valid credentials")
	public void verifyUserLoginWithValidCredentials() throws IOException 	
	{
	String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSubmit();
	}
    @Test (description = "Verify whether the user can log in with valid username and invalid password")
    public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
    {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSubmit();
    }
   @Test (description = "Verify whether the user can log in with invalid username and valid password")
	public void verifyUserLoginWithInValidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
	}
   @Test (description = "Verify whether the user can log in with invalid credentials")
   public void verifyUserLoginWithInvalidCredentials() throws IOException
	{
		String username=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
	}
	

}
