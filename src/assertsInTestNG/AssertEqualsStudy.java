package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
  @Test
  public void AssertStudy() 
  {
	  String name="VCTC";
	  String name1="VCTC1";
	  
//	  if(name.equals(name1))
//	  {
//		  System.out.println("TC is paased");
//	  }
//	  
//	  else {
//		System.out.println("TC is failed");
//	}
	  
	 // Assert.assertEquals(name, name1, "String are Not Matching");
	  
	  Assert.assertEquals(name, name1, "String is not matching");
  }
}
