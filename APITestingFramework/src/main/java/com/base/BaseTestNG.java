package com.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;

import com.listeners.SuiteListeners;
import com.listeners.TestsListeners;

@Listeners({SuiteListeners.class, TestsListeners.class})
public class BaseTestNG  {
	
	private static Properties prop;
	
	public static Properties getInstance()
	{
		if(prop == null)
			try {
				createInstance();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return prop;
	}

	private static Properties createInstance() throws IOException {
		
		FileReader reader = new FileReader(System.getProperty("user.dir")+"/src/test/resources/TestData/qa.properties");
		 prop = new Properties();
			prop.load(reader);
		return prop;
	}

}
