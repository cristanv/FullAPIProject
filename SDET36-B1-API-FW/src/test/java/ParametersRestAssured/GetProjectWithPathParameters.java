package ParametersRestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetProjectWithPathParameters {
	
	@Test
	public void pathPara() {
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		   .pathParam("pid", "TY_PROJ_1002")
		   
		//action
		.when()
		   .get("/projects/{pid}")
		   
	   //validation
		   .then()
		       .log().all();
		   
		 
	}

}
