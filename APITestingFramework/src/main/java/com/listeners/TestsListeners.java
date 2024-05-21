package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.extent.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

public class TestsListeners implements ITestListener {
	
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println(("*** Running test method " + result.getMethod().getDescription()+ "..."));
        ExtentTestManager.startTest(result.getMethod().getMethodName());
        ExtentTestManager.getTest().assignCategory(result.getMethod().getRealClass().getSimpleName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
        ExtentTestManager.getTest().log(LogStatus.PASS, "Passed");
        ExtentTestManager.endtest();

	}
	
	@Override
    public  void onTestFailure(ITestResult result)
    {
        ExtentTestManager.getTest().log(LogStatus.FAIL,"Failed.....");
        ExtentTestManager.endtest();

    }
	
	@Override
    public void onFinish(ITestContext result)
    {
	    ExtentTestManager.endtest();
        ExtentTestManager.endTest();

    }




}
