package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public static void main(String[] args) {
		HandlingActions action=new HandlingActions();
		action.initializeBrowser();
		//action.verifyRightClick();
		//action.verifyMouseOver();
		//action.verifyDragAndDrop();
		//action.browserCloseandQuit();
		try {
			action.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 
	public void verifyRightClick()
	{
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions=new Actions(driver); //Actions is the predefined class.
		actions.contextClick(home).build().perform();//contextclick is used for right click function.
			
	}
	
	public void verifyMouseOver()
	{
		WebElement others=driver.findElement(By.xpath("//a[@id='progress-bars']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(others).build().perform();
	}
	
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
	    actions.dragAndDrop(drag, drop).build().perform();		
		
	}
	public void verifyKeyboardAction() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
			
	}
}
