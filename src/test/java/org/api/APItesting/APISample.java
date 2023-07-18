package org.api.APItesting;

import org.api.Baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
@Test
public class APISample extends BaseClass{
	
	public void getListOfFlights() {
	//1.Header
		addHeader("accept", "application/json");
	//2.Reqtype	
	Response response = addReqType("GET", "https://omrbranch.com/api/flights?page=1");
		
		
	int statusCode = getStatusCode(response);	
	System.out.println(statusCode);
	
	System.out.println(getResBodyAsPrettyString(response));
	
	
	}

}
