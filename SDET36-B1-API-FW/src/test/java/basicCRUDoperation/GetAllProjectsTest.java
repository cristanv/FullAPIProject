package basicCRUDoperation;

import org.apache.commons.lang3.Validate;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {
	
	@Test
	public void getAllproject(){
	
	//step 1: create requred data
	
	//step 2: send request
	Response resp=RestAssured.get("http://localhost:8084/projects");
	
	
	//step 3: validate the response
	ValidatableResponse validate=resp.then();
	validate.log().all();
}
}