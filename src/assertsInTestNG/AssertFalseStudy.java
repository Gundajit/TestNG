package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseStudy {
  @Test
  public void f() 
  {
	  boolean result=true;
	  Assert.assertFalse(result, "result is true");
  }
}
