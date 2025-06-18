package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	private WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newsfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebutton;
	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	private WebElement searchbutton;
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchnewsfield;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement submitsearch;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")private WebElement newsaddedalert;
	@FindBy(xpath="//h1[text()='Manage News']")private WebElement managenewstitle;
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	private WebElement managenewslink;

	
	public ManageNewsPage clickNewButton() {
		newbutton.click();
		return this;
	}

	public ManageNewsPage newNewsField(String newsdata) {
		newsfield.click();
		newsfield.sendKeys(newsdata);
		return this;
	}

	public ManageNewsPage clickSave() {
		savebutton.click();
		return this;
	}

	public ManageNewsPage clickSearchNews() {
		//managenewslink.click();
		searchbutton.click();
		return this;
	}
	

	public ManageNewsPage searchNewsFiled(String searchnews) {
		searchnewsfield.click();
		searchnewsfield.sendKeys(searchnews);
		return this;
	}

	public ManageNewsPage searchsubmit() {
		submitsearch.click();
		return this;
	}
	public boolean newsaddedmessage()
	{
		return newsaddedalert.isDisplayed();
	}
	public boolean searchnewspage()
	{
		return managenewstitle.isDisplayed();
	}
}
