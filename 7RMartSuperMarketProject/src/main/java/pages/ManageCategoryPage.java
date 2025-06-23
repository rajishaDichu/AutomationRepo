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
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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
	@FindBy(xpath = "//h3[text()='Enter Category Informations']")
	private WebElement addcategorypage;

	public ManageCategoryPage clickOnNewButton() {
		newcategorylink.click();
		return this;
	}

	public ManageCategoryPage clickCategoryfield() {
		categoryfield.click();
		categoryfield.sendKeys("Cooking Essentials");
		return this;
	}

	public ManageCategoryPage enterCategory(String categoryname) {
		categoryfield.sendKeys(categoryname);
		return this;
	}

	public ManageCategoryPage discountSelect() {

		discount.click();
		return this;
	}

	public ManageCategoryPage choosefile() {

		choosefilebutton.sendKeys(Constant.IMAGEDATAFILE);
		return this;

	}

	public ManageCategoryPage pageScroll() {
		PageUtility pageutility = new PageUtility();
		pageutility.pageScroll();
		return this;
	}

	public ManageCategoryPage applywait() {
		WaitUtility waitutility = new WaitUtility();
		waitutility.applywait(radiobutton1, driver);
		return this;
	}

	public ManageCategoryPage radioButton1() {

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		// wait.until(ExpectedConditions.elementToBeClickable(radiobutton1)); //
		// Explicit wait
		radiobutton1.click();
		return this;
	}

	public ManageCategoryPage radioButton2() {

		radiobutton2.click();
		return this;
	}

	public ManageCategoryPage clickOnSave() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", savebutton);
		// savebutton.click();
		return this;
	}

	public boolean addcategory() {
		return addcategorypage.isDisplayed();
	}
}
