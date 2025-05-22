package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import sun.awt.SunHints.Value;

public class WebElementCommands extends Base{

	public static void main(String[] args) 
	{
     WebElementCommands elements= new WebElementCommands();
     elements.initializeBrowser();
     elements.handlingWebElements();
     //elements.browserCloseandQuit();
	}
	
	public void handlingWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id=\"single-input-field\"]"));
		messagebox.sendKeys("Hello");
		WebElement showmessagebutton= driver.findElement(By.xpath("//button[@id=\"button-one\"]"));
		showmessagebutton.click();
		System.out.println(showmessagebutton.isDisplayed());
	    System.out.println(showmessagebutton.isEnabled());
		WebElement yourmessage= driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
		System.out.println(yourmessage.getText());
		messagebox.clear();
		WebElement valuea=driver.findElement(By.id("value-a"));
		System.out.println(valuea.getTagName());
		System.out.println(showmessagebutton.getCssValue("background-color"));
	}

}
