package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforserializationAndDeserialization.EmployeeDetails;

public class SerializationEmployeeDetails {
	
	@Test
	public void serializeEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
		
		//step 1: create project of POJO and provide avalues
		EmployeeDetails emp=new EmployeeDetails("cristan", 567, 767661698, "address");
		//step 2: create object of object Maapper from jackson mapper
		ObjectMapper ob=new ObjectMapper();
		//step 3: write data in to the json file
		ob.writeValue(new File("./EmployeeDetails.json"), emp);
		
		
	}
	
	

}
