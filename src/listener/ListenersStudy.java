package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersStudy implements ITestListener
{
    @Override
    public void onTestStart(ITestResult Result)
    {
    	Reporter.log("Test started succefully", true);
    	ITestListener.super.onTestStart(Result);
    }
    
    @Override
    public void onTestSkipped(ITestResult Result)
    {
    	Reporter.log("Test skip succefully", true);
    	ITestListener.super.onTestSkipped(Result);
    }
    
    @Override
    public void onTestSuccess(ITestResult Result)
    {
    	Reporter.log("Test Run succefully", true);
    	ITestListener.super.onTestSuccess(Result);
    }
    
    @Override
    public void onTestFailure(ITestResult Result)
    {
    	Reporter.log("Test Fail succefully", true);
    	ITestListener.super.onTestFailure(Result);
    }
}
