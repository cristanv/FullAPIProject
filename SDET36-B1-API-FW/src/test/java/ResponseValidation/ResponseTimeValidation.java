package ResponseValidation;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
	@Test
	public void responseTimeVAlidation() {
		
		//prerequisites
				baseURI = "http://localhost";
				port = 8084;
				
		//Action
		when()
			.get("/projects")
				 
		//validation
		.then()
			.assertThat().time(Matchers.lessThan(1000L), TimeUnit.MILLISECONDS);
			//.log().all();
	}

}
