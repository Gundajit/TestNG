package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class InvocationCountTest {
  @Test(invocationCount = 3)
  public void MyMethod() 
  
  {
	  Reporter.log("My method is running", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("My befor method is running", true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("my after method is running", true);
  }

}
