package org.api.APItesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePut {
	
	//Put and Patch
		
		public static void main(String[] args) {
			
			
			RequestSpecification reqSpec;


			reqSpec = RestAssured.given();

			reqSpec = reqSpec.header("accept","Content-Type");
			reqSpec = reqSpec.body("{\r\n" + 
					"    \"flightName\": \"AirIndia\",\r\n" + 
					"    \"Country\": \"India\",\r\n" + 
					"    \"Destinations\": 97,\r\n" + 
					"    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + 
					"}");

			Response response = reqSpec.get("https://omrbranch.com/api/flight/12117");
			
			System.out.println(response.getStatusCode());
			System.out.println(response.asPrettyString());

	}



}
