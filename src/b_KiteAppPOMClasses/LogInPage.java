package b_KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{

	//1. declare the webelement using @findby method & make them Private
	@FindBy(id = "userid") private WebElement UserId ;
	@FindBy (id = "password") private WebElement Pass;
	@FindBy (xpath = "//button[@type='submit']") private WebElement SubmitButton;
	@FindBy (xpath = "//span[contains(text(),'Password should')]") private WebElement ErrorMessage;
	
	//2. create constructor to initialize element using initelement n  pagefactory
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId(String UserName)
	{
		UserId.sendKeys(UserName);
	}
	
	public void EnterPass(String Pwd)
	{
		Pass.sendKeys(Pwd);
	}
	
	public void ClickOnSubmitButton()
	{
		SubmitButton.click();
	}
	
   public String ErrorMsg()
   {
	  String ActualText = ErrorMessage.getText(); 
	  return ActualText;
   }
}
