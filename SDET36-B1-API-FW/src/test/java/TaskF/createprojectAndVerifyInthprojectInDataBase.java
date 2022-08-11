package TaskF;

import static org.testng.Assert.assertEquals;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class createprojectAndVerifyInthprojectInDataBase extends BaseAPIClass{
	
	@Test
	public void CreateAndVerifyProjectInData() throws SQLException {
		 
 ProjectLibrary pLib= new ProjectLibrary("anus", "FireF"+jLib.getRandom(), "Created", 13);
	     
	     
	     Response resp = given()
	   		  .body(pLib)
	   		  .contentType(ContentType.JSON)
	           .when()
	              .post(EndPointsLibrary.createProject);
	     System.out.println(resp);
	     
	     String expData = rLib.getJSONData(resp, "projectId");
	     Reporter.log(expData,true);
	     
	     String querry= "select * from project;";
	     String actData = dLib.readDataFromDBAndValidate(querry, 1, expData);
	     
	     
	     assertEquals(expData, actData);
		
	}

}
