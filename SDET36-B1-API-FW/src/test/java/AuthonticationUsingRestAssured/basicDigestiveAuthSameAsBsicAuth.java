package AuthonticationUsingRestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class basicDigestiveAuthSameAsBsicAuth {
	
	@Test
	public void basicDigestiveAuth() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().digest("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
		
	}

}
