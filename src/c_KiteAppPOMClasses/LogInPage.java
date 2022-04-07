package c_KiteAppPOMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import c_UtilityClasses.Utility;


public class LogInPage
{
	//1. variable decleration using @findby method n declear them as private
	
	@FindBy (id = "userid") private WebElement UserId;
	@FindBy (id = "password") private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2. cretae constructor to initilize element using pagefactory  n pass driver, this as argument in 
	//2. create constructor using pagefactory to initialize variabl n pass driver, this
	public  LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. create method with parameter
	
	public void EnterUID() throws IOException
	{
		UserId.sendKeys(Utility.getDataFromPropertyFile("UN"));
	}
	
	public void EnterPass() throws IOException
	{
		Pass.sendKeys(Utility.getDataFromPropertyFile("PWD"));
	}
	
	public void clickOnLOgInButton()
	{
		LoginButton.click();
		Reporter.log("Account loged IN", true);
	}

}
