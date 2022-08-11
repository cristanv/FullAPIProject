package GenericLibrary;


import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	
	/**
	 * this method will get the json data throhgh json path from response body
	 * @param response
	 * @param path
	 * @return
	 */
	public String  getJSONData(Response response,String path) {
		
		
		String jsonData = response.jsonPath().get(path);
		return jsonData;
		
	}

}
