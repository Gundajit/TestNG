package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test
  
  public void KiteLogin() 
  {
	  System.setProperty("webdriver.chrome.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Jar files of chrome\\chromedriver.exe");
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
  }
}
