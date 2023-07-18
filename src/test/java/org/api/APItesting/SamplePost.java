package org.api.APItesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePost {
	
	
		
		public static void main(String[] args) {
			
			
			RequestSpecification reqSpec;


			reqSpec = RestAssured.given();

			reqSpec = reqSpec.header("accept","Content-Type");
			reqSpec = reqSpec.body("\r\n" + 
					"{\r\n" + 
					"    \"flightName\": \"AirIndia\",\r\n" + 
					"    \"Country\": \"India\",\r\n" + 
					"    \"Destinations\": \"87\",\r\n" + 
					"    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + 
					"}");

			Response response = reqSpec.get("https://omrbranch.com/api/flights");
			
			System.out.println(response.getStatusCode());
			System.out.println(response.asPrettyString());

	}


}
