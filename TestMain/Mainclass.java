package TestMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLib.Driver;

public class Mainclass {
	String URL ="https://blazedemo.com/";
	WebDriver driver;
		
	
	@BeforeMethod
		public void launchBrowser() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\new_project\\new_project1234\\chromedriver.exe");  
			driver=Driver.getDriver("chrome");
			driver.get(URL);
			Thread.sleep(4000);
		}
	
	
		@Test
		public void bookticket() throws InterruptedException 
		{
			
			
			Select sel = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
			sel.selectByVisibleText("Boston");
			GenericLib.CommonLib.waitForPageToLoad(driver);
			Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
			sel1.selectByVisibleText("London");
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			GenericLib.CommonLib.waitForPageToLoad(driver);
			driver.findElement(By.xpath("//tr[1]//td[1]//input[1]")).click();
			driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Raj");
			driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123, Vishwahalli");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
			driver.findElement(By.xpath("//input[@id='state']")).sendKeys("KA");
			driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("54321");
			Select sel2 =new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
			sel2.selectByVisibleText("American Express");
			driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("5432 1234 5678 8765");
			driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
			driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2021");
			driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Smith");
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			GenericLib.CommonLib.waitForPageToLoad(driver);
			String BookingID = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
			System.out.println(BookingID);
			System.out.println("Ticket booked Successfully");
		
			}
		@AfterMethod
		public void logOut()
		{
			driver.quit();;
		}	
	}



