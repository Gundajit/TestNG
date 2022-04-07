package a_KiteAppPOMClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage 
{
	@FindBy(xpath = "//span[text()='GSZ319']") private WebElement Username;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getActualUserID()
	{
		String ActualUserID=Username.getText();
		return ActualUserID;
	}
	
	
	public void LogOut() throws InterruptedException
	{
		Username.click();
		Thread.sleep(500);
		logoutbutton.click();
		Reporter.log("Loged Out Account", true);
	}
}
