package org.api.Baseclass;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	RequestSpecification reqspec;
	Response res;
	
	public void addHeader(String key,String value) {

		reqspec =	RestAssured.given().header(key,value);
	}
	public void addHeaders(Header headers) {

		reqspec =	RestAssured.given().header(headers);
	}	
	public void addPathParam(String key,String value) {

		reqspec = reqspec.pathParam(key, value);
	}
	public void addQueryParam(String key,String value) {

	reqspec = 	reqspec.queryParam(key, value);
	}
	//To Add Payload
	public void addBody(String body) {
		
		reqspec = reqspec.body(body);

	}

	public void addBody(Object body) {
		
		reqspec = reqspec.body(body);

	}
	
	public Response addReqType(String reqType,String endPoint) {
		
		switch (reqType) {
		
			case "GET":
				res = reqspec.get(endPoint);
				break;

			case "POST":
				res = reqspec.post(endPoint);
				break;
			case "PUT":
				res = reqspec.put(endPoint);
				break;
			case "PATCH":
				res = reqspec.patch(endPoint);
				break;	
			case "DELETE":
				res = reqspec.delete(endPoint);
				break;	
			
			default:
				break;
						}
					return res;
	}
	public int getStatusCode(Response res) {
		int statusCode = res.getStatusCode();
		return statusCode;

	}
	public String getResBodyAsString(Response res) {
		String asString = res.asString();
		return asString;

	}
	public String getResBodyAsPrettyString(Response res) {
		String asPrettyString = res.asPrettyString();
		return asPrettyString;
	}
	
	public void addBasicAuth(String username,String password) {
		reqspec = reqspec.auth().preemptive().basic(username, password);

	}
}
