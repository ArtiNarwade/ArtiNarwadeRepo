package com.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteListeners implements ISuiteListener {
	
	@BeforeSuite
	public void OnStart(ISuite ISuite)
	{
        System.out.println("########Before-Suite##########");
	}
	
	@AfterSuite
	public void OnFinish(ISuite ISuite)
	{
        System.out.println("########After-Suite##########");

	}

}
