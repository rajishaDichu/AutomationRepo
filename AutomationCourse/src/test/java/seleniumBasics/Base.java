package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
public WebDriver driver;    //webdriver is the interface and driver is the reference.

public void initializeBrowser()
{
	driver=new ChromeDriver(); //ChromeDriver is the default browser class for chrome
	driver.get("https://selenium.qabible.in/");
    driver.manage().window().maximize();
}

public void browserCloseandQuit()
{
	//driver.close();
	driver.quit();
}
	public static void main(String[] args) 
	{
		Base base =new Base();// base is the object for class Base.
		base.initializeBrowser();
		base.browserCloseandQuit();
		

	}

}
