package com.utility;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.util.HashMap;


public class ResponseSpecifications {
	
	public static Response PostRequestSpec(String BaseUrl,String endpoint,String body)
	{
		RequestSpecification rsp = given().contentType("application/json");
		return CommonResponse.CommonPostRequest(rsp,BaseUrl,endpoint,body);
	}
	
	public static Response GetRequestSpec(String BaseUrl, String endpoint,HashMap<String, String> params)
	{
		RequestSpecification rsp = given().queryParams(params);
		return CommonResponse.CommonGetRequest(rsp,BaseUrl,endpoint,params);
	}
	

}
