package basicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class crttheproctkeyValuePairwithFormData {
	
	@Test
	public void createtheprojectwithkeyValuePairformdata() {
		
		//create random number
				Random r=new Random();
				int rand = r.nextInt(500);
				
				// create a necessary data
				
				
				//step 2:send the request
				RequestSpecification request=RestAssured.given();
				request.formParam("createdBy", "crist");
				request.formParam("projectName", "TYSS"+rand);
				request.formParam("status", "create");
				request.formParam("teamsize", 20);
				
				//request.contentType(ContentType.JSON);
				
				Response resp=request.post("http://localhost:8084/addProject");
				
				ValidatableResponse validate=resp.then();
				validate.log().all();
				
				
	}
			

}
