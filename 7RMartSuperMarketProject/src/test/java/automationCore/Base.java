package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver; // webdriver is the interface and driver is the reference.

	@BeforeMethod
	public void initializeBrowser() {
		driver = new ChromeDriver(); // ChromeDriver is the default browser class for chrome
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void browserCloseandQuit() {
		// driver.close();
		// driver.quit();
	}

}
