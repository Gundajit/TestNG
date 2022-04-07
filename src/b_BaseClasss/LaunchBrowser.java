package b_BaseClasss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser 
{
	protected WebDriver driver ;
	public void LaunchingBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Jar files of chrome\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	public void closingbrowser()
	{
		driver.close();
	}

}
