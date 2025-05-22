	package seleniumBasics;

public class WebdriverMethods extends Base{
public void handlingWebDriverMethod()
{
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	String handleid=driver.getWindowHandle();
	System.out.println(handleid);
}
	public static void main(String[] args) {
		WebdriverMethods drivermethods=new WebdriverMethods();
		drivermethods.initializeBrowser();
		drivermethods.handlingWebDriverMethod();
		//drivermethods.browserCloseandQuit();
		

	}

}
