package basicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatePojectTest {
	
	@Test
	public void createprojectTest() {
		
		//create random number
		Random r=new Random();
		int rand = r.nextInt(500);
		
		// create a necessary data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "crist");
		jobj.put("projectName", "TYSS"+ rand);
		jobj.put("status", "create");
		jobj.put("teamsize", 20);
		
		//step 2:send the request
		RequestSpecification request=RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		
		Response resp=request.post("http://localhost:8084/addProject");
		
		//step 3: validate the response
		//System.out.println(resp.prettyPeek());
		
		ValidatableResponse validate=resp.then();
		validate.log().all();	

}
}
