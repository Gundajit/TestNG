package Grouping_inTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 
{
	 @Test(groups = "Sanity")
	  public void Test7()
	  {
		  Reporter.log("Tc7 is running", true);
	  }
	  
	  @Test (groups = {"Regression","Sanity"})
	  public void Test8()
	  {
		  Reporter.log("Tc8  is running", true);
	  }
	  
	  @Test (groups = "Sanity")
	  public void Test9()
	  {
		  Reporter.log("Tc9 is running", true);
	  }
	  
	  @Test
	  public void Test10()
	  {
		  Reporter.log("Tc10 is running", true);
	  }
	  
	  @Test (groups = "Sanity")
	  public void Test11()
	  {
		  Reporter.log("Tc11 is running", true);
	  }
	  
	  @Test (groups = "Regression")
	  public void Test12()
	  {
		  Reporter.log("Tc12 is running", true);
	  }
}
