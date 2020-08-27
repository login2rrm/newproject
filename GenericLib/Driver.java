package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	
	

public static WebDriver driver;

public static WebDriver getDriver(String browser)
{
	if(browser.equals("firefox"))
	{
	driver = new FirefoxDriver();	
	}
	
	else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe") ;
		driver= new ChromeDriver();
	}
	return driver;
}
	
}
