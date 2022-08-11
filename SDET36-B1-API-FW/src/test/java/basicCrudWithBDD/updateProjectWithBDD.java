package basicCrudWithBDD;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class updateProjectWithBDD {
	
	@Test
	public void updateproject() {
		
		baseURI="http://localhost";
		port=8084;
		
		//step 2: create a data
				JSONObject jobj=new JSONObject();
				jobj.put("createdBy", "chtu");
				jobj.put("projectName", "tito");
				jobj.put("status", "creat");
				jobj.put("teamsize", 10);
				
				given()
				  .body(jobj)
				  .contentType(ContentType.JSON)
				.when()
				  .put("/projects/TY_PROJ_1202")
				.then()
				 .assertThat().statusCode(200) .log().all();	
	}

}
