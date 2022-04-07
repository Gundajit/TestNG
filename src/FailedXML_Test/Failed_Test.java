package FailedXML_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_Test {
	
	@Test (timeOut = 2000)
	  public void Test1() throws InterruptedException
	  {
		  Reporter.log("Tc1 is running", true);
		  Thread.sleep(2000);
	  }
	  
	  @Test 
	  public void Test2()
	  {
		  Reporter.log("Tc2  is running", true);
	  }
	  
	  @Test (timeOut = 1000)
	  public void Test3() throws InterruptedException
	  {
		  Reporter.log("Tc3 is running", true);
		  Thread.sleep(100);
	  }
	  
	  @Test
	  public void Test4()
	  {
		  Reporter.log("Tc4 is running", true);
	  }
	  
	  @Test 
	  public void Test5()
	  {
		  Reporter.log("Tc5 is running", true);
	  }
	  
	  @Test 
	  public void Test6()
	  {
		  Reporter.log("Tc6 is running", true);
	  }
}
