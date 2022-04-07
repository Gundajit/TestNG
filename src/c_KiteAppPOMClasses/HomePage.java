package c_KiteAppPOMClasses;



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
	
	public String ActualUID()
	{
		String ActualUserId = Username.getText();
		return ActualUserId;
	}
	
	public void LogOut() throws InterruptedException
	{
		Username.click();
		Thread.sleep(1000);
		logoutbutton.click();
		Reporter.log("Account loged out", true);
	}
}
