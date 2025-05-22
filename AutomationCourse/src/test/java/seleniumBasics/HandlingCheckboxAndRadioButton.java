package seleniumBasics;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxAndRadioButton extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingCheckboxAndRadioButton checkbox=new HandlingCheckboxAndRadioButton();
		checkbox.initializeBrowser();
		checkbox.verifyCheckBox();
		//checkbox.verifyRadioButton();
		//checkbox.browserCloseandQuit();

	}

	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		
		
}
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value=\"yellow\"]"));
		radiobutton.click();
		
	}
}