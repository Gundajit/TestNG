package SerialandParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialandParallel2 {
  @Test
  public void Mymethod1() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Jar files of chrome\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
  }
}
