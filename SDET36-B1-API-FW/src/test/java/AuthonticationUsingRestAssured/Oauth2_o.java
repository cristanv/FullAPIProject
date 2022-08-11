package AuthonticationUsingRestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

public class Oauth2_o {
	
	@Test
	public void Oauth2_o() {
		
		baseURI="http://coop.apps.symfonycasts.com";
		
		//Create a request to generate accesss token 
		Response resp = given()
		.formParam("client_id", "kittu159")
		 .formParam("client_secret", "49dacbbfeeeaa54963db8df8a86356dd")
		 .formParam("grant_type", "client_credentials")
		 .formParam("redirect_uri", "http://kittu123.com")
		 .formParam("code", "authorization_code")
		 
		 .when()
		    .post("http://coop.apps.symfonycasts.com/token");
		
		 //Capture the access token from the response of the above request
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//Create another request and use the token to access the APIs
		given()
		  .auth().oauth2(token)
		  .pathParam("USER_ID", 3677)
				 
		.when()
		  .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/toiletseat-down")
				 
		  .then().log().all();
				 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
