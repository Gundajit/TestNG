package a_KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a_KiteAppPOMClasses.HomePage;
import a_KiteAppPOMClasses.LogInPage;
import a_KiteAppPOMClasses.PinPage;
import a_UtilityPackage.Utility;
import a_baseClasses.Base;

public class UserIDValidation extends Base {
	
	LogInPage LogIn;
	PinPage  PIN;
	HomePage Home;
 
	@BeforeClass
	public void Launchbroweser()
	{
		launchBrowser();
		LogIn=new LogInPage(driver);
		PIN=new PinPage(driver);
		Home=new HomePage(driver);
	}
	
	@BeforeMethod
	public void LogInToKite() throws IOException
	{
		LogIn.EnterUserID(Utility.ReadDataFromExel(0, 0));
		LogIn.EnterPass(Utility.ReadDataFromExel(0, 1));
		LogIn.clickOnLOgInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		PIN.enterpin(Utility.ReadDataFromExel(0, 2));
		PIN.clickOnSubmitButton();
	
	}
	
	@Test
  public void ValidateUserID() throws IOException 
  {
		int TCID = 211;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String actualUserId = Home.getActualUserID();
		String ExpectedUserID = Utility.ReadDataFromExel(0, 3);
		Assert.assertEquals(actualUserId, ExpectedUserID, "actulUserID is not Equal to Expected UserID");
        Utility.SS(driver, TCID);
		Reporter.log("Validate user id ", true);
  }
	
	@AfterMethod
	public void LogOut() throws InterruptedException
	{
	   Home.LogOut();
	}
	
	@AfterClass
	public void ClosingBrowser()
	{
		CloseBrowser();
		
	}
}
