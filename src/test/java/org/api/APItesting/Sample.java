package org.api.APItesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {
	
	public static void main(String[] args) {
		RequestSpecification reqSpec;


		reqSpec = RestAssured.given();

		reqSpec = reqSpec.header("accept","Content-Type");


//		reqSpec = reqSpec.pathParam("fno","12117");
		reqSpec = reqSpec.queryParam("page", "1");


//		Response response = reqSpec.get("https://omrbranch.com/api/flight/{fno}");
		Response response = reqSpec.get("https://omrbranch.com/api/flights");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);

}
	}
	
