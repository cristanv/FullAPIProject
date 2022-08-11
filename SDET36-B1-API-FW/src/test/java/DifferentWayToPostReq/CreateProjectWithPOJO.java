package DifferentWayToPostReq;

import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithPOJO {
	
	@Test
	public void creatProject() {
		
		baseURI="http://localhost";
		port=8084;
				
		Random r=new Random();
				int r1 = r.nextInt(200);
		
		ProjectLibrary pl=new ProjectLibrary("critu", "Google"+r1, "completed", 15);
		
		given()
		  .body(pl)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		.assertThat().statusCode(201)
		 .log().all();
	}

}
