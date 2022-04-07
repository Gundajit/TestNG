package c_KiteAppTestClass;

import org.testng.annotations.Test;

import c_BaseClasses.Base;
import c_KiteAppPOMClasses.HomePage;
import c_KiteAppPOMClasses.LogInPage;
import c_KiteAppPOMClasses.PinPage;
import c_UtilityClasses.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UserIdValidation extends Base {
	
	LogInPage LogIn;
	HomePage Home;
	PinPage PIN;

	@BeforeClass
  public void beforeClass() throws IOException
  {
	 launchBrowser();
	 LogIn=new LogInPage(driver);
	 Home=new HomePage(driver);
	 PIN= new PinPage(driver);
  }
	
  @BeforeMethod
  public void beforeMethod() throws IOException
  {
	  LogIn.EnterUID();
	  LogIn.EnterPass();
	  LogIn.clickOnLOgInButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
	  PIN.EnterPin();
	  PIN.clickOnSubmitButton();
  }
  
  @Test
  public void ValidateUID() throws IOException 
  {
	  Assert.assertEquals(Home.ActualUID(), Utility.getDataFromPropertyFile("ExpectedUN"), "UID not matching tc is fail");
  }
 
  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Home.LogOut();
  }

  @AfterClass
  public void afterClass()
  {
	  CloseBrowser();
  }

}
