package GenericLib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLib {
	
	
	public static void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	/*public void waitForXpathPresent(WebDriver driver ,String wbxpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbxpath)));
	}*/
	
}
