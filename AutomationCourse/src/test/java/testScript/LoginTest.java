package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.TestNGBase;

public class LoginTest extends TestNGBase {
@Test
	public void verifyUserLoginWithValidCredentials()
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys("secret_sauce");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		submitbutton.click();
	}
@Test
    public void verifyUserLoginWithValidUsernameAndInvalidPassword()
    {
    	WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys("secret_saucea");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		submitbutton.click();
    }
   @Test 
	public void verifyUserLoginWithInValidUsernameAndValidPassword()
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		usernamefield.sendKeys("standarde_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys("secret_sauce");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		submitbutton.click();
	}
   @Test
   public void verifyUserLoginWithInvalidCredentials()
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		usernamefield.sendKeys("standarde_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys("secrete_sauce");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		submitbutton.click();
	}
}

