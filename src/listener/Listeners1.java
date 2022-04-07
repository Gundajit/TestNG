package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Your TC is started",true);
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Sorry your TC is failed",true);
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Congarts your TC is passed",true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Your TC is Skipped, please check",true);
		ITestListener.super.onTestSkipped(result);

	}
}
