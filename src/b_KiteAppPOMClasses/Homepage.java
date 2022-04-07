package b_KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage 
{
	//1. decleare variable using @findby method n make them as private webelement
	
	@FindBy(xpath = "//span[text()='GSZ319']" ) private WebElement UserName1;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
	
	//2. cretae constructor toinitialize variable using pagefactory initelement pass driver this as argument
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. decleare element to handle as method in pom classes
	public String GetActualUserId()
	{
		String ActuaUserId = UserName1.getText();
		return ActuaUserId;
	}
	
	public void clickOnLogoutButton() throws InterruptedException  
	{
		UserName1.click();
		Thread.sleep(1500);
		LogOutButton.click();
		Reporter.log("Account Loged out", true);
	}


}
