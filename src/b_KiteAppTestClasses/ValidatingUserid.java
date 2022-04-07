package b_KiteAppTestClasses;

import org.testng.annotations.Test;

import b_BaseClasss.LaunchBrowser;
import b_KiteAppPOMClasses.Homepage;
import b_KiteAppPOMClasses.LogInPage;
import b_KiteAppPOMClasses.PinPage;
import b_UtilityClasss.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidatingUserid extends LaunchBrowser {
 
	LogInPage LogIn;
	PinPage pin;
	Homepage Home;
	
  @BeforeClass
  public void beforeClass()
  {
	  LaunchingBrowser();
	  LogIn=new LogInPage(driver);
	  pin=new PinPage(driver);
	  Home=new Homepage(driver);
  }

  @BeforeMethod
  public void beforeMethod() throws IOException 
  {
	LogIn.EnterUserId(Utility.ReadDataFromExel(0, 0)); 
	LogIn.EnterPass(Utility.ReadDataFromExel(0, 1));
	LogIn.ClickOnSubmitButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
	pin.EnterPin(Utility.ReadDataFromExel(0, 2));
	pin.clickonContinueButton();
	  
  }
  
  @Test
  public void ValidateUserID() throws IOException 
  {
	  int TCID=211;
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Assert.assertEquals(Home.GetActualUserId(), Utility.ReadDataFromExel(0, 3), "user id not matching tc fail");
	  Utility.ss(driver, TCID);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  Home.clickOnLogoutButton();
  }

 
  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
