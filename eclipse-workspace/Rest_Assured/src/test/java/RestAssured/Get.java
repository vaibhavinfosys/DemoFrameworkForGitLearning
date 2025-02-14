package RestAssured;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

import static io.restassured.RestAssured.*;



public class Get {
	@Test
	public void GetRequest() {
		
		
		/*Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.statusCode());
		
		System.out.println(response.statusLine());
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		
		System.out.println(response.getBody().prettyPrint());
		*/
		
		// BDD Approach

		given()
		
		
		.when().get("https://reqres.in/api/users?page=2")
		
		
		.then().log().all().statusCode(201);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
