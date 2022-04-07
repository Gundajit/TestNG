package BrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  
	@Parameters ("Browsername")
	@Test
  public void Tc1(String Browsername) 
  {
		WebDriver driver= null;
	  if(Browsername.equals("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "I:\\\\Educational File\\\\TESTING MODULE\\\\Selenium\\\\Jar files of chrome\\\\chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  else if(Browsername.equals("Edge"))
	  {
		System.setProperty("webdriver.edge.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Driver of Edge\\msedgedriver.exe");
		driver= new EdgeDriver();
	 }
	  
	  driver.get("https://kite.zerodha.com/");
  }
}
