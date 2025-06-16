package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constant;

public class ManageCategoryPage {
	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	private WebElement managecategorylink;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	private WebElement newcategorylink;
	@FindBy(xpath = "//input[@id='category']")
	private WebElement categoryfield;
	@FindBy(xpath = "//li[@id='134-selectable']")
	private WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement choosefilebutton;
	@FindBy(xpath = "//input[@name='top_menu'and@value='no']")
	private WebElement radiobutton1;
	@FindBy(xpath = "//input[@name='show_home'and@value='no'] ")
	private WebElement radiobutton2;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement savebutton;
	@FindBy(xpath="//h3[text()='Enter Category Informations']")private WebElement addcategorypage;
	

	public void clickOnManageCategory() {
		managecategorylink.click();
	}

	public void clickOnNewButton() {
		newcategorylink.click();
	}

	public void clickCategoryfield() {
		categoryfield.click();
		categoryfield.sendKeys("Cooking Essentials");
	}

	public void enterCategory(String categoryname) {
		categoryfield.sendKeys(categoryname);
	}

	public void discountSelect() {
		
		discount.click();
	}

	public void choosefile() {
		
		choosefilebutton.sendKeys(Constant.IMAGEDATAFILE);
		
	}
    
	public void pageScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	public void applywait() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.elementToBeClickable(radiobutton1));
	    }
	    
	public void radioButton1() {

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		//wait.until(ExpectedConditions.elementToBeClickable(radiobutton1)); // Explicit wait
		radiobutton1.click();
	}

	public void radioButton2() {

		radiobutton2.click();
	}

	public void clickOnSave() {
		JavascriptExecutor js = (JavascriptExecutor)driver;                  
		js.executeScript("arguments[0].click();", savebutton);
		//savebutton.click();
	}

	public boolean addcategory() {
		return addcategorypage.isDisplayed();
	}
}
