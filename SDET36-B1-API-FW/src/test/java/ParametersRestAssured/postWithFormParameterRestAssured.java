package ParametersRestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postWithFormParameterRestAssured {
	
	@Test
	public void postrequst() {
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		  .formParam("createdBy", "cr")
		  .formParam("projectName", "kajak")
		  .formParam("status", "good")
		  .formParam("teamSize", 23)
		  .contentType(ContentType.JSON)
		  
		  .when()
		     .post("/addProject")
		     
		  .then()
		     .log().all();
		     	     
		     
	}

}
