package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailStudy {
  @Test
  public void f() 
  {
	  String a="Pune";
	  String b=null;
	  Assert.assertNotNull(a, "a is  null");
	  System.out.println("a is not null");
	  
	  Assert.assertNull(b, "b is not null");
	  System.out.println("b is null");
	  Assert.fail();
  }
}
