package basicCrudWithBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostCrratProjectTest {
	
	@Test
	public void creatProject() {
		
		baseURI="http://localhost";
		port=8084;
		
		//create random number
		Random r=new Random();
		int rand = r.nextInt(500);
		
		// create a necessary data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "crist");
		jobj.put("projectName", "TYSS"+ rand);
		jobj.put("status", "create");
		jobj.put("teamsize", 20);
		
		//step 2: send the request
		given()
		  .body(jobj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
	}

}
