package basicCrudWithBDD;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class updateProjectWithBDD {
	
	@Test
	public void updateproject() {
		
		
				
		baseURI="http://localhost";
		port=8084;
		
		//step 2: create a data
				JSONObject jobj=new JSONObject();
				jobj.put("createdBy", "chtttt");
				jobj.put("projectName", "titjjjj");
				jobj.put("status", "createdd");
				jobj.put("teamsize", 23);
				
				given()
				  .body(jobj)
				  .contentType(ContentType.JSON)
				.when()
				  .put("/projects/TY_PROJ_1202")
				.then()
				 .assertThat().statusCode(201) .log().all();
				 
	}

}
