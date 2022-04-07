package Grouping_inTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 
{
  @Test(groups = "Sanity")
  public void Test1()
  {
	  Reporter.log("Tc1 is running", true);
  }
  
  @Test (groups = "Regression")
  public void Test2()
  {
	  Reporter.log("Tc2  is running", true);
  }
  
  @Test (groups = "Sanity")
  public void Test3()
  {
	  Reporter.log("Tc3 is running", true);
  }
  
  @Test
  public void Test4()
  {
	  Reporter.log("Tc4 is running", true);
  }
  
  @Test (groups = "Sanity")
  public void Test5()
  {
	  Reporter.log("Tc5 is running", true);
  }
  
  @Test (groups = "Regression")
  public void Test6()
  {
	  Reporter.log("Tc6 is running", true);
  }
}
