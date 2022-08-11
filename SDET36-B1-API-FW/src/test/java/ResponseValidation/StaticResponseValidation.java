package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void staticResponseGet() {
		
		baseURI="http://localhost";
		port=8084;
		String expData = "TY_PROJ_1005";
		
		Response resp = when()
		   .get("/projects");
		
		//validation
		String actData = resp.jsonPath().get("[4].projectId");
		System.out.println("ActualData = "+actData);
		
		Assert.assertEquals(actData, expData);
		
		//resp.then().log().all();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
