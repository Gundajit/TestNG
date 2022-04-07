package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class kiteSample {
  @Test
  public void EnterPass_Username() 
  {
	  Reporter.log("userid validatetc is pass", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("log in to kite", true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("logout to kite", true);
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("launch the browser", true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("close the browser" ,true);
  }

}
