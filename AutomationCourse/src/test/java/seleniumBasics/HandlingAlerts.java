package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{

	public static void main(String[] args) 
	{
      HandlingAlerts alerts=new HandlingAlerts();
      alerts.initializeBrowser();
     // alerts.verifyAlerts();
     // alerts.verifyConfirmAlert();
        alerts.verifyPromptAlert();
      // alerts.browserCloseandQuit();


	}
    
	public void verifyAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();// click on OK
		
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickme3.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();// click on OK
		//alert.dismiss();// to click on Cancel	
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme4=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickme4.click();
		Alert alert=driver.switchTo().alert();
	    alert.sendKeys("Rajisha");
	    alert.accept();
		
	}
}
