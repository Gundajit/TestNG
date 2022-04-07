package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExcludeTest 
{
	 @Test
	  public void a() 
	  {
		
		  Reporter.log("method a is running", true);
	  }
	  
	  @Test 
	  public void  b() 
	  {
		  Reporter.log("method b is running", true);
	  }
	  
	  @Test 
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
