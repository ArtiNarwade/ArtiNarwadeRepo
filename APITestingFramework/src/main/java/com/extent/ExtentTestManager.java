package com.extent;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {
	static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
	static ExtentReports extent = ExtentManager.getInstance();
	
	public static synchronized ExtentTest startTest(String testName)
	{
		ExtentTest test = extent.startTest(testName);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()),test);
		return test;
	}
	
	public static synchronized ExtentTest getTest()
	{
		return extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	}
	
	public static synchronized void endtest()
	{
		extent.endTest(getTest());
	}
	
	public static void endTest()
	{
		extent.flush();
	}

}
