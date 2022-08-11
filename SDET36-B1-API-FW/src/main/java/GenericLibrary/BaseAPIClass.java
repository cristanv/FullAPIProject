package GenericLibrary;

import java.sql.SQLException;

import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseAPIClass {
	
	public DatabaseLibrary dLib=new DatabaseLibrary();
	public JavaLibrary jLib=new JavaLibrary();
	public RestAssuredLibrary rLib=new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConsfig() throws SQLException {
		dLib.connectToDataBase();
		Reporter.log("connectionsuccessul",true );
		baseURI="http://localhost";
		port=8084;
	}
	
	@AfterSuite
	public void asConfig() throws SQLException {
		dLib.closeDB();
		Reporter.log("connction close",true);
		
	}
	

}
