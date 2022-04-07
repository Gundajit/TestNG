package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout
{
  @Test
  public void a() 
  {
	  Reporter.log("method a is running ", true);
  }
  
  @Test (timeOut = 2990)
  public void b() throws InterruptedException
  {
	  Reporter.log("method b is running ", true);
	  Thread.sleep(3000);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("method c is running" ,true);
  }
  
  
  @Test
  public void d()
  {
	  Reporter.log("method d is running" ,true);
  }
}
