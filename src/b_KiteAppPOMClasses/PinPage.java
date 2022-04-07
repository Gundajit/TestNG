package b_KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PinPage 
{
	//1. declare variable using @findby method and make them as Pivate
	@FindBy(id = "pin") private WebElement Pin1;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//2. create constructor to initialize variable using pagefactory initelement n pass driver, this
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. decleare webelement to be handle as method
	
	public void EnterPin(String PinNo)
	{
		Pin1.sendKeys(PinNo);
		Reporter.log("Pin enter successfully", true);
	}
	
	public void clickonContinueButton()
	{
		ContinueButton.click();
	}
}
