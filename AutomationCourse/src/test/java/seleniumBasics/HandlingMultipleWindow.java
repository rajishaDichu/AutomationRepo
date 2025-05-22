package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base{

	public static void main(String[] args) 
	{
		HandlingMultipleWindow multiplewindow=new HandlingMultipleWindow();
		multiplewindow.initializeBrowser();
		multiplewindow.handlingMultipleWindow();
		//multiplewindow.browserCloseandQuit();
	}

	public void handlingMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandleId=driver.getWindowHandle();
		System.out.println(firstWindowHandleId);
	    WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
	    clickhere.click();
	    Set<String>handleids=driver.getWindowHandles();//to store multiple handleids
	    System.out.println(handleids);
	    Iterator<String>values=handleids.iterator();
	    while(values.hasNext())
	    {
	    	String currentid=values.next();
	    	if(!currentid.equals(firstWindowHandleId))
	    	{
	    		driver.switchTo().window(currentid);
	    		WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
	    		email.sendKeys("abc@gmail.com");
	    		WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
	    		submit.click();	
	    	}
	    	
	    }
	    
	  
	}
}
