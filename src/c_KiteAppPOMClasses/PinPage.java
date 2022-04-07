package c_KiteAppPOMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import c_UtilityClasses.Utility;

public class PinPage 
{
	@FindBy(id = "pin") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SubmitButton;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPin() throws IOException
	{
		Pin.sendKeys(Utility.getDataFromPropertyFile("PIN"));
	}
	
	public void clickOnSubmitButton()
	{
		SubmitButton.click();
		Reporter.log("Clicking on submit button", true);
	}
	

}
