package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validate_Response {
	
	@Test
	public void validateResponse() {
		
	RequestSpecification reqSpec = RestAssured.given();
	
	reqSpec.baseUri("https://reqres.in/");
	reqSpec.basePath("/api/users");
	reqSpec.queryParam("page","2").queryParam("id", "11");
	
	Response response = reqSpec.get();
	
	System.out.println(response.getBody().asString());
	
	JsonPath jsonpath = response.jsonPath();
	
	
	String  path = jsonpath.get("data.first_name");
	
	System.out.println(path);
	
	
	
	
	
	/*
	 * Response response=reqSpec.get();
	 * 
	 * System.out.println(response.getBody().asString());
	 * 
	 * String text=response.getBody().asString();
	 * 
	 * Assert.assertEquals(text.contains(text),true,"Check for first name as George"
	 * );
	 * 
	 * JsonPath jsonpath = response.jsonPath();
	 * 
	 * String firstName= jsonpath.get("data[0].first_name");
	 * 
	 * System.out.println(firstName);
	 * 
	 * Assert.assertEquals(firstName, "George","Test case is Fail");
	 */
         
	
	
		
		
	}

}
