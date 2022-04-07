package BrowserStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class MSEdge {
  @Test
  public void test() 
  {
	  System.setProperty("webdriver.edge.driver", "I:\\Educational File\\TESTING MODULE\\Selenium\\Driver of Edge\\msedgedriver.exe");
	  
	  EdgeOptions opt=new EdgeOptions();
	  opt.addArguments("headless");
	  
	  WebDriver driver= new EdgeDriver(opt);
	  
	  driver.get("https://www.fb.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.close();
	  
  }
}
