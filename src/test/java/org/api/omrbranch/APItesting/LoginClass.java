package org.api.omrbranch.APItesting;

import java.lang.reflect.Type;

import org.api.Baseclass.BaseClass;
import org.api.omrbranch.APItesting.Pojo.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class LoginClass extends BaseClass{
	
	@Test
	public void Login() {
	//1.Header
		addHeader("accept", "application/json");
	//2.BasicAuth
		
	addBasicAuth("gtboss69@gmail.com", "Gowtham@0311");	
	//3. addReqType
	Response response = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
	
	int statusCode = getStatusCode(response);	
	System.out.println(statusCode);
	String resBodyAsPrettyString = getResBodyAsPrettyString(response);
	System.out.println(resBodyAsPrettyString);
	Assert.assertEquals(statusCode, 200,"Verify after Status Code");

	
//Data data = response.as(Data.class);

//	Login_OutPut_Pojo
////	JSON PATH
//	
//	JsonPath path = response.jsonPath();	
//	Object object = path.get("data[0].flightname");
//	System.out.println(object);
	}

}
