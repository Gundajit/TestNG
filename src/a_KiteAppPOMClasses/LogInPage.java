package a_KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogInPage
{
	//1. variable decleration using @findby method n declear them as private
	
	@FindBy (id = "userid") private WebElement UserId;
	@FindBy (id = "password") private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2. cretae constructor to initilize element using pagefactory  n pass driver, this as argument in 
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. create method with parameter
	
	public void EnterUserID( String Username)
	{
		UserId.sendKeys(Username);
	}
	
	public void EnterPass(String Pwd)
	{
		Pass.sendKeys(Pwd);
	}
	
	public void clickOnLOgInButton()
	{
		LoginButton.click();
	}

}
