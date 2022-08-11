package basicCRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatProjectWithExistingProjec {
	
	@Test
	public void creatProjectWithExistingProjec() {
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "crist");
	jobj.put("projectName", "TYSS");
	jobj.put("status", "create");
	jobj.put("teamsize", 20);
	
	
	RequestSpecification req=RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	
	Response resp=req.post("http://localhost:8084/addProject");
	
	ValidatableResponse validate=resp.then();
	validate.log().all();
	
	
	
	}
}
