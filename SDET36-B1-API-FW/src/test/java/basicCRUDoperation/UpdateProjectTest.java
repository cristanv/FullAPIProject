package basicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	@Test
	public void upapdatProject() {
		
		//create random number
				Random r=new Random();
				int rand = r.nextInt(500);
		//step 2: create a data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "chotu");
		jobj.put("projectName", "tou"+ rand);
		jobj.put("status", "creat");
		jobj.put("teamsize", 30);
		
		
		//step 2: send request
		RequestSpecification req=RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response resp=req.put("http://localhost:8084/projects/TY_PROJ_1202");
		
		//step 3:validate response
		resp.then().log().all();
		
	}		
		
	}


