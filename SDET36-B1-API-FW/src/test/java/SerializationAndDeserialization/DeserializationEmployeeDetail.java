package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforserializationAndDeserialization.EmployeeDetails;

public class DeserializationEmployeeDetail {
	
	
	@Test
	public void deserializeEmpDetails() throws JsonParseException, JsonMappingException, IOException {
		
	
	//create object of object mapper - jackson mapper
	ObjectMapper obj=new ObjectMapper();
	
	//read the value from object mapper
	EmployeeDetails e1 = obj.readValue(new File(".\\EmployeeDetails.json"), EmployeeDetails.class);
	
	//fetch the required value from the class
	System.out.println(e1.geteName());
	System.out.println(e1.getPhno());
	}
}
