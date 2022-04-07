package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.ListenersStudy.class)
public class Testing {
	
	
  @Test
  public void Tc1() 
  {
	  Reporter.log("Tc is running ", true);
  }
  
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @Test
  public void TC3()
  {
	  Assert.fail();
	  Reporter.log("Tc3 is running ", true);
  }
  
  @Test (dependsOnMethods = {"TC3"})
  public void TC4()
  {
	  Reporter.log("TC4 is running", true);
  }
  
}
