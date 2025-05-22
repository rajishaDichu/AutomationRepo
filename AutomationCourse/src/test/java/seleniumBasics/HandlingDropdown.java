package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown dropdown=new HandlingDropdown();
		dropdown.initializeBrowser();
		dropdown.verifyDropdown();
		//dropdown.browserCloseandQuit();

	}
	
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown1);
		//select.selectByIndex(1);
		//select.selectByVisibleText("SQL");
		select.selectByValue("python");
		
		
	}

}
