package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforserializationAndDeserialization.EmployeeDetails;
import POJOforserializationAndDeserialization.EmployeeDetails_update;

public class serializationEmployeeUpdated {
	
	
	
	@Test
	public void serializeEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
		
		int phno[]= {701983010,767661698};
		String mail[]= {"kittu@gmail.com","kutkk@gmail.com"};
		
		
		//step 1: create project of POJO and provide avalues
		EmployeeDetails_update emp=new EmployeeDetails_update("cristan", 638, phno, mail, "BANGALORE");
		
		//step 2: create object of object Maapper from jackson mapper
		ObjectMapper ob=new ObjectMapper();
		
		//step 3: write data in to the json file
		ob.writeValue(new File("./EmployeeDetails_UPADET.json"), emp);
		
		
	}

}
