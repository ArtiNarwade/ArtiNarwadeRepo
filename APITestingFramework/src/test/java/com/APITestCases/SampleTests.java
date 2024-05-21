package com.APITestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import com.base.BaseTestNG;
import com.extent.ExtentTestManager;
import com.google.gson.Gson;
import com.pojo.CreatePostData;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.*;
import static com.constants.Constants.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;



public class SampleTests extends BaseTestNG  {
	//public static Properties prop;
	static Properties prop = BaseTestNG.getInstance();
	
	@Test
	public void CreatePost()
	{
		CreatePostData createPostData =  new CreatePostData();
		createPostData.setName("morpheus");
		createPostData.setJob("leader");
		Gson gson = new Gson();
		String reqBody = gson.toJson(createPostData);
		
		Response resp = ResponseSpecifications.PostRequestSpec(prop.getProperty("BaseURL"),CREATE,reqBody);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(201, resp.getStatusCode());
		//ExtentTestManager.getTest().log(LogStatus.INFO, "test passed");
		
		//Extract json response data
		
		JsonPath json = resp.jsonPath();
		String respData = json.getString("name");
		System.out.println(respData);
		
		/*
		//Using a List we can use
		List<String> jsonResponse = resp.jsonPath().getList("name");
		System.out.println(jsonResponse.get(0));
		
		//Parsing JSON ArrayList and HashMap
		Map<String, String> company = resp.jsonPath().getMap("name[0]");
		System.out.println(company.get("name"));
		*/

		softAssert.assertAll();
	}
	
	@Test
	public void getData()
	{
		HashMap<String, String> params = new HashMap<>();
		params.put(PAGE, GETVALUE);
		Response resp = ResponseSpecifications.GetRequestSpec(prop.getProperty("BaseURL"),GET,params);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(200, resp.getStatusCode());
		softAssert.assertAll();

	}

}
