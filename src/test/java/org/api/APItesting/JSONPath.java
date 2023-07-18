package org.api.APItesting;

import org.api.Baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class JSONPath extends BaseClass{
	
	@Test
	public void getListOfFlights() {
	//1.Header
		addHeader("accept", "application/json");
	//2.Reqtype	
	Response response = addReqType("GET", "https://omrbranch.com/api/flights?page=1");
		
		
	int statusCode = getStatusCode(response);	
	System.out.println(statusCode);
	
	System.out.println(getResBodyAsPrettyString(response));
//	JSON PATH
	
	JsonPath path = response.jsonPath();	
	Object object = path.get("data[0].flightname");
	System.out.println(object);
	}

}
