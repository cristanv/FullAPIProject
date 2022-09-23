import static io.restassured.RestAssured .*;

public class Postrequestsimple {

	public static void main(String[] args) {
		
	baseURI="https://reqres.in/";
	
	when()
	  .get("/api/users/2")
	.then()
	   .assertThat().statusCode(200).log().all();
	}
}
