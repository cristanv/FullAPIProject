package ResponseValidation;

import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class createmultipleprojectWithDiffdata {
	
	@Test
	public void creatProject(String createdBy, String projectName, String status, int teamSize) {
		
		
		baseURI = "http://localhost";
		port = 8084;
		Random r=new Random();
		int rand = r.nextInt(500);
		
		//prerequest
		ProjectLibrary jlib=new ProjectLibrary(createdBy, projectName+rand, status, teamSize);
		
		given()
		 .body(jlib)
		 .contentType(ContentType.JSON)
	   
		//Actions
		.when()
		 .post("/addProject")
		 
		//Validation
		.then().log().all();	
		
	}

}
