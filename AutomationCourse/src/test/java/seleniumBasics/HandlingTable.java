package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{

	public static void main(String[] args) {
		HandlingTable table=new HandlingTable();
		table.initializeBrowser();
		table.verifyTable();
		//table.browserCloseandQuit();

	}
	
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(fulltable.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));//2 is the row number
		System.out.println(tablerow.getText());
		
	}

}
