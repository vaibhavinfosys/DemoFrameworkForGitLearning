package RestAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Request {
	
	
	@Test
	public void POST_Request() {
		
		RequestSpecification reqSpec=RestAssured.given();
		
		reqSpec.baseUri("https://gorest.co.in/");
		
		Response resp=reqSpec.basePath("/public/v2/users").queryParam("name", "sunitha").get();
		
		
		String body = resp.getBody().asString();
		
		System.out.println(body);
		
		
		/*
		 * JSONObject jason=new JSONObject();
		 * 
		 * jason.put("name", "Sunitha");
		 * 
		 * jason.put("gender", "Female");
		 * 
		 * jason.put("email", "Sunitha@gmail.com");
		 * 
		 * jason.put("status", "Active");
		 */
		
		//Response resp = reqSpec.contentType("application/json").accept("application/json").header("Authorization","Bearer cf5190e3313ed505be43eb124bf33d8af703c87fbdb0be7525bb8f442080c4d0").body(jason).post();
			
		
		/*
		 * String body = resp.getBody().asString();
		 * 
		 * System.out.println(body);
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
