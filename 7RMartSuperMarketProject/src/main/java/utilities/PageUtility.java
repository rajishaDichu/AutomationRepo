package utilities;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ManageCategoryPage;

public class PageUtility {
	WebDriver driver;
	public void selectDropdownWithValue(WebElement element, String value)
    {
		Select object = new Select(element);
		object.selectByValue(value);	
	}
    public void selectRadioButtonWithVisibleText(WebElement element, String value)
    {
    	Select object=new Select(element);
    	object.selectByVisibleText(value);
    }
    
    public void selectCheckboxWithIndex(WebElement element, int value)
    {
    	Select object=new Select(element);
    	object.selectByIndex(value);
    }
    
    public void selectCheckbox(WebElement element, String value)
    {
    	Select object=new Select(element);
    	object.selectByContainsVisibleText(value);
    }
    public void deselectCheckbox(WebElement element, String value)
    {
    	Select object=new Select(element);
    	object.deselectByVisibleText(value);
    }
    public void  pageScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
    }

}
