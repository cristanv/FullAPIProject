package DifferentWayToPostReq;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class createProjectWithJSONObject {
	
	@Test
	public void CreateProject() {
		baseURI = "http://localhost";
		port = 8084;
		
		Random r=new Random();
		r.nextInt(200);
		
		//Step 1: create pre requisites
				JSONObject jObj = new JSONObject();
				jObj.put("createdBy", "Prakash");
				jObj.put("projectName", "Allstates "+r);
				jObj.put("status", "Completed");
				jObj.put("teamSize", 100);
				
				given()
				 .body(jObj)
				 .contentType(ContentType.JSON)
				 
				.when()
				 .post("/addProject")
				 
				.then()
				 .assertThat()
				 .statusCode(201)
				 .log().all();
					
	}

}
