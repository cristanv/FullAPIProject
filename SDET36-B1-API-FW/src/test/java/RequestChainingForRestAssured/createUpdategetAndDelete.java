package RequestChainingForRestAssured;

import java.util.Random;

import org.omg.CORBA.Object;
import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class createUpdategetAndDelete {
	
	@Test
	public void createUpdategetAndDelete() {
		
		baseURI="http://localhost";
		port=8084;
		
		//Step 1: create a project using POJO
	     ProjectLibrary pLib= new ProjectLibrary("anus", "FireF", "Created", 13);
	     
	     
	     Response resp = given()
	   		  .body(pLib)
	   		  .contentType(ContentType.JSON)
	          .when()
	              .post("/addProject");
	     
	              
	         //capture the project id
	   		String proId = resp.jsonPath().get("projectId");
	   		System.out.println(proId);
	   		
	   		ProjectLibrary pLib1= new ProjectLibrary("anu", "FireF", "Completed", 13); 		
	   		//for updated project with parameter
	   		given()
	   		  .body(pLib1)
	   		  .contentType(ContentType.JSON)
	   		  .pathParam("pid", proId )
	   		.when()
	   		   .put("/projects/{pid}")
	   		.then()
	   		    .log().all();
	   		
	   		//for getting the project with path parameter
	   		given()
	   		  .pathParam("pid1", proId)
	   		.when()
	   		   .get("/projects/{pid1}")
	   		.then()
	   		   .assertThat().statusCode(200).log().all();
	   		
	   		//for deleting the project with path parameter
	   		given()
	   		  .pathParam("pid2", proId)
	   		.when()
	   		  .delete("/projects/{pid2}")
	   		.then()
	   		   .assertThat().statusCode(204).log().all();
	}

}
