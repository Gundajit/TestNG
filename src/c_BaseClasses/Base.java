package c_BaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import c_UtilityClasses.Utility;

public class Base 
{
	protected WebDriver driver;
	public void launchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Jar files of chrome\\chromedriver.exe");
		//ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--Disable Notification");
		//driver=new ChromeDriver(opt);
		driver=new ChromeDriver();
		driver.get(Utility.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		Reporter.log("Browser Launch", true);
		
	}
	
	public void CloseBrowser()
	{
		driver.close();
		Reporter.log("Browser close", true);
	}


}
