package RequestChainingForRestAssured;

import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class practisechaining {
	
	@Test
	public void creatupanddelet() {
		baseURI="http://localhost";
		port=8084;
		
		ProjectLibrary pLib= new ProjectLibrary("anus", "FireF", "Created", 13);
		
		Response resp = given()
		  .body(pLib)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject");
		
		String proID = resp.jsonPath().get("projectID");
		
		ProjectLibrary pLib1= new ProjectLibrary("anus", "FireF", "Created", 13);
		given()
		 .body(pLib1)
		 .contentType(ContentType.JSON)
		 .pathParam("pid", proID)
		.when()
		  .get("/projects/{pid}")
		.then()
		  .assertThat().statusCode(200).log().all();
		  
	 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
