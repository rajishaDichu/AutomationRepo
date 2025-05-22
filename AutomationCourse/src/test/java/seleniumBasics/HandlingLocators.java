package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
	
	public void verifyLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));//partial form of "simple form Demo".
		driver.findElement(By.name("viewport"));
		driver.findElement(By.cssSelector("button[id='button-one']"));																															
		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[text()='Show Message']")); //locating by the text
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]")); //locating by the starting of text show message
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); //locating with && operation so both should be true
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));//locating by parent
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}

	public static void main(String[] args) 
	{
	HandlingLocators locator= new HandlingLocators();
	locator.initializeBrowser();
	locator.verifyLocators();
	//locator.browserCloseandQuit();

	}

}
