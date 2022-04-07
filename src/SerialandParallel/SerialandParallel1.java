package SerialandParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialandParallel1 
{
	@Test
	  public void MyMethod1() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Jar files of chrome\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.close();
	  }
 
}
