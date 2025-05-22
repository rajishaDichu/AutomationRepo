package seleniumBasics;

public class HandlingNavigationCommands extends Base
{

	public static void main(String[] args) 
	{
		HandlingNavigationCommands navigate= new HandlingNavigationCommands();
		navigate.initializeBrowser();
		navigate.verifyNavigationCommand();
		//navigate.browserCloseandQuit();
	}
public void verifyNavigationCommand()
{
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
