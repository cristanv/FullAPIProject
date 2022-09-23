package AuthonticationUsingRestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class UsingBearerToken {
	
	@Test
	public void UsingBearer() {
		
		baseURI = "https://api.github.com";
		
		
		HashMap hm=new HashMap();
		hm.put("name", "helloCritu");
		hm.put("description", "api framework");
		
		given()
		 .auth().oauth2("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")
		 .body(hm)
		 .contentType(ContentType.JSON)
		 
	    .when()
	     .post("/user/repos")
	     
	    .then()
	    .log().all();
		
	}

}
