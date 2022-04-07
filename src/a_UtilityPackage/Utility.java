package a_UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	public static String ReadDataFromExel(int RowNo, int CellNo) throws IOException
	{
		FileInputStream Myfile=new FileInputStream("I:\\Educational File\\TESTING MODULE\\Screenshot\\ExelPractice.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		String value1 = Mysheet.getRow(RowNo).getCell(CellNo).getStringCellValue();
		return value1;
	}
	
	
	public static void SS(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti=new File("I:\\Educational File\\TESTING MODULE\\Screenshot\\"+TCID+"ss.png");
		FileHandler.copy(src, desti);
		Reporter.log("ss taken" , true);
	}
	

}
