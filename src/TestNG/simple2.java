package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class simple2 {
  @Test
  public void display1() 
  {
	  Reporter.log("hi good morning", true);
  }
}
