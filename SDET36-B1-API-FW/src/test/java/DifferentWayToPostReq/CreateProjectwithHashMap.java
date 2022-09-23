package DifferentWayToPostReq;


import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateProjectwithHashMap {
	
	@Test
	public void createProject() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		
		Random r=new Random();
		r.nextInt(200);
		
		//Step 1: create pre requisites 
				HashMap map = new HashMap();
				map.put("createdBy", "Chandan");
				map.put("projectName", "Sony "+r);
				map.put("status", "Created");
				map.put("teamSize", 4);
		
				given()
				 .body(map)
				 .contentType(ContentType.JSON)
				 
				.when()
				 .post("/addProject")
				 
				.then()
				 .assertThat().statusCode(200)
				 .log().all();	
		
	}

}
