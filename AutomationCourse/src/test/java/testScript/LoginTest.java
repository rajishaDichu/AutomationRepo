package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
@Test
	public void verifyUserLoginWithValidCredentials() throws IOException 	
	{
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement submitbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		//submitbutton.click();
	String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSubmit();
	}
@Test
    public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
    {
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSubmit();
    }
   @Test 
	public void verifyUserLoginWithInValidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmit();
	}
   @Test
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

