package RestAssured;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class Get_Request {
	
	@Test
	public void Getmethod() {
		
		    
		/*
		 * Response response = RestAssured.get("https://gorest.co.in/public/v2/users");
		 * 
		 * // get the Response Body
		 * 
		 * String body = response.getBody().asString();
		 * 
		 * System.out.println(body);
		 */
		
		      
		     
				
				  given()
				  
				  .when() 
				  .get("https://reqres.in/api/users/2")
				  
				  .then() 
				  .log().all() ;
				  
				  
				  
				 
				  
				  
				  
				 
		     
		     
		     
		     
		     
		     
		     
		
		
	}

}
