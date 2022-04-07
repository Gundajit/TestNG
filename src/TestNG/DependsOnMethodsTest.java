package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {
  @Test
  public void a() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("method a is running", true);
  }
  
  @Test (dependsOnMethods = {"a"})
  public void  b() 
  {
	  Reporter.log("method b is running", true);
  }
  
  @Test (dependsOnMethods = {"d"})
  public void c()
  {
	  Reporter.log("method c is running", true);
  }
  
  @Test
  public void d()
  {
	  Reporter.log("method d is running",true);
  }
}
