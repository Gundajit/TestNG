package c_UtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility
{
	public static void ss(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti= new File("I:\\Educational File\\TESTING MODULE\\Screenshot\\"+TCID+"ss.png");
		FileHandler.copy(src, desti);
		Reporter.log("Screenshot is taken", true);
	}



   public static String getDataFromPropertyFile(String key) throws IOException
   {
	   Properties obj=new Properties();
	   FileInputStream Myfile= new FileInputStream("I:\\Educational File\\TESTING MODULE\\11 DEC\\TestNG\\KiteLogInCredential.properties");
	   obj.load(Myfile);
	   String value = obj.getProperty(key);
	   return value;
   }
}