package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullStudy {
  @Test
  public void Study() 
  {
	  String a=null;
	  
	  Assert.assertNotNull(a, "a is null");
  }
}
