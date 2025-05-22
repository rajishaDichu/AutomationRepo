package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaSciptExecuterSample extends Base{

	public static void main(String[] args) 
	{
         JavaSciptExecuterSample script=new JavaSciptExecuterSample();
         script.initializeBrowser();
         script.verifyJavaScriptExecuter();
        // script.browserCloseandQuit();
         
	}

	public void verifyJavaScriptExecuter()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;                  //casting driver to javascript executor
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", ""); //+350 scroll up, -350 scroll down.
	}
	
}
