package ParametersRestAssured;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProjectQueryParameter {
	
	@Test
	public void QueryParamete() {
		
		baseURI="http://reqres.in";
		
		
		given()
		  .queryParam("page", 2)
		  
		.when()
		  .get("/api/users")
		  
		.then()
		  .log().all();
		
		
		
	}

}
