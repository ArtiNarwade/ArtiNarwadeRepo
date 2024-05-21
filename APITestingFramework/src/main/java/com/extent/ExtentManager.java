package com.extent;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManager {
	private static ExtentReports extent;
	public static ExtentTest test;
	
	public static ExtentReports getInstance()
	{
		if(extent  == null)
			createInstance();
		return extent;
		
	}

	private static ExtentReports createInstance() {
		File file = new File(System.getProperty("user.dir")+"/Extent/ExtentReport.html");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		} catch(Exception ex)
		{
			
		}
	
	extent = new ExtentReports(System.getProperty("user.dir")+"/Extent/ExtentReport.html");
	return extent;
}
}
