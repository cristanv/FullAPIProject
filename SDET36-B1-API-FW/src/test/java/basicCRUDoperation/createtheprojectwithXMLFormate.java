package basicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createtheprojectwithXMLFormate {
	
	@Test
	public void createTheProjWithXML() {
		
		
		//create random number
		Random r=new Random();
		int rand = r.nextInt(500);
		
		// create a necessary data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "crist");
		jobj.put("projectName", "TYSS"+ rand);
		jobj.put("status", "create");
		jobj.put("teamsize", 20);
		
		RequestSpecification req=RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.XML);
		
		Response resp=req.post("http://localhost:8084/addProject");
		
		ValidatableResponse vali=resp.then();
		vali.log().all();
	}

}
