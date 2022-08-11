package ResponseValidation;


import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {
	
	@Test
	public void dynamicResponse() {
		
		baseURI = "http://localhost";
		port = 8084;
		String expData = "TY_PROJ_1005";
		
		//action
		Response resp = when()
		  .get("/projects");
		
		//Validation
	     boolean flag = false;
	     List<String> pIDs = resp.jsonPath().get("projectId");
		for(String projectID : pIDs) {
			if(projectID.equalsIgnoreCase(expData)) {
				flag=true;
				break;
			}
		}
		Assert.assertTrue(flag);
	     
		
	}

}
