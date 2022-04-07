package b_KiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import b_BaseClasss.LaunchBrowser;
import b_KiteAppPOMClasses.LogInPage;
import b_UtilityClasss.Utility;

public class ValidatingWrongPassErrorMsg extends LaunchBrowser
{
	LogInPage LogIn;
	@BeforeClass
	public void BeforeClass()
	{
		LaunchingBrowser();
		
		LogIn=new LogInPage(driver);
	}
	
   @BeforeMethod
   public void BeforeMethod() throws IOException
   {
	   LogIn.EnterUserId(Utility.ReadDataFromExel(0, 0));
	   LogIn.EnterPass(Utility.ReadDataFromExel(0, 4));
	   LogIn.ClickOnSubmitButton();
   }
  @Test
  public void ValidateErrorMsg() throws IOException 
  {
	  int TCID= 212;
	  String ActualErrorMsg = LogIn.ErrorMsg();
	  String ExpectedErrorMsg = Utility.ReadDataFromExel(1, 4);
	  Assert.assertEquals(ActualErrorMsg, ExpectedErrorMsg, "Error MSG is not Matching");
	  Utility.ss(driver, TCID);
	  Reporter.log("Error MSG is matching Tc is pass", true);
  }
  
  @AfterClass
  public void AfterClass()
  {
	  driver.close();
  }
}
