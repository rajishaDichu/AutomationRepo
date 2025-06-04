package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{

	public static void main(String[] args) 
	{
      HandlingFileUpload upload=new HandlingFileUpload();
      upload.initializeBrowser();
      upload.verifyFileUploadUsingSendKeys();
     // upload.verifyFIleUploadUsingRobotclass();

	}
	
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\rajis\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\Assignment # Polymorphism.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	 public void verifyFIleUploadUsingRobotclass() throws AWTException
	 {
		 driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		 WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		 selectpdf.click();
		 StringSelection selection=new StringSelection("C:\\Users\\rajis\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\Assignment # Polymorphism.pdf");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		 Robot robot=new Robot();
		 robot.delay(2500); // applying time delay
		 robot.keyPress (KeyEvent.VK_ENTER);
		 robot.keyRelease (KeyEvent.VK_ENTER);
		 robot.keyPress (KeyEvent.VK_CONTROL);
		 robot.keyPress (KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyPress (KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	 }

}
