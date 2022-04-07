package a_KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	@FindBy(id = "pin") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SubmitButton;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterpin(String Pin1)
	{
		Pin.sendKeys(Pin1);
	}
	
	public void clickOnSubmitButton()
	{
		SubmitButton.click();
	}
	

}
