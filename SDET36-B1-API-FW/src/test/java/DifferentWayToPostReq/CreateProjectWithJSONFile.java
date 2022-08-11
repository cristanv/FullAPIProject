package DifferentWayToPostReq;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectWithJSONFile {
	
	@Test
	public void createProject() {
		
		baseURI="http://localhost";
		port=8084;
		
		//Step 1: create pre requisites
		File f=new File(".\\src\\test\\resources\\givenDataBDD.json");
		
		given()
		  .body(f)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		.assertThat().statusCode(201)
		 .log().all();
		  	
	}

}
