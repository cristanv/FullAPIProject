package RequestChainingForRestAssured;

import org.omg.CORBA.Object;
import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectAndGetProjectDeleteProject {

	
	
	@Test
	public void requestChaining1() {
		
		Random r=new Random();
		int rand = r.nextInt(200);
		
		baseURI="http://localhost";
		port=8084;
		
		//Step 1: create a project using POJO
		ProjectLibrary pLib= new ProjectLibrary("anushre", "FireFox"+rand, "Created", 13);
		
		
		Response resp = given()
		  .body(pLib)
		  .contentType(ContentType.JSON)
        .when()
           .post("/addProject");
           
         //capture the project id
		String proId = resp.jsonPath().get("projectId");
		System.out.println(proId);
		
		resp.then().log();
		
		//Create a get request and pass proID as path parameter
		given()
		 .pathParam("pid", proId)
		.when()
		 .get("/projects/{pid}")
		.then()
		 .assertThat().statusCode(200).log().all();
		
		//deleting the project with path parameter
		given()
		   .pathParam("pid", proId)
		.when()
		   .delete("/projects/{pid}")
		.then()
		   .log().all();
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
