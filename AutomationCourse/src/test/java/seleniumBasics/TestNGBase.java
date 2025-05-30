package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase 
{
	public WebDriver driver;    //webdriver is the interface and driver is the reference.
@BeforeMethod
	public void initializeBrowser()
	{
		driver=new ChromeDriver(); //ChromeDriver is the default browser class for chrome
		driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	}
@AfterMethod
	public void browserCloseandQuit()
	{
		//driver.close();
		//driver.quit();
	}
}
