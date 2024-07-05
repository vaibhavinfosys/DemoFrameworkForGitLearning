package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Basic_Authentication {
	@Test
	public void basicAuthentication() {
		
		RequestSpecification reqSpec = RestAssured.given();
		
		
		reqSpec.baseUri("https://postman-echo.com/");
		
		reqSpec.basePath("/basic-auth");
		
		Response respo = reqSpec.auth().basic("postman","password").get();
		
		System.out.println(respo.getStatusCode() +" And "+ respo.getStatusLine());
		
		System.out.println(respo.getBody().asString());
		
		
		/*
		 * Response responses=reqSpec.get();
		 * 
		 * System.out.println(responses.statusLine());
		 */
		
		
		
		
	}

}
