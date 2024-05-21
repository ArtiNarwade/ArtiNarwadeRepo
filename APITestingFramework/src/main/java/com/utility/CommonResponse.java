package com.utility;

import java.util.HashMap;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CommonResponse {
	
	public static Response CommonPostRequest(RequestSpecification rsp,String BaseUrl,String endpoint,String body)
	{
		Response rs = rsp.relaxedHTTPSValidation().when().filters(new RequestLoggingFilter()).
				baseUri(BaseUrl).basePath(endpoint).body(body).post().then().extract().response();
		return rs;
	}
	
	public static Response CommonGetRequest(RequestSpecification rsp,String BaseUrl,String endpoint,HashMap<String, String> params)
	{
		Response rs = rsp.relaxedHTTPSValidation().when().filters(new RequestLoggingFilter()).
				baseUri(BaseUrl).basePath(endpoint).get().then().extract().response();
		return rs;
	}

}
