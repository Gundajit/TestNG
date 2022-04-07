package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void AssertStudy() 
  {
	  Boolean Result=true;
	  Assert.assertTrue(Result, "Result is false");
  }
}
