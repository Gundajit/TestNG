package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	SoftAssert s= new SoftAssert(); // create object of softassert
  @Test
  public void f() 
  {
	  String a="pune";
	  String b="pune1";
	  
	  
	  s.assertNotNull(a, "a is null");
	  s.assertEquals(a, b, "a and b are not equal");
	  
	  s.assertAll();
  }
}
