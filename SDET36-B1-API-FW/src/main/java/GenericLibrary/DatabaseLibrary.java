package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Result;

public class DatabaseLibrary {
	
	Driver driverRef;
	Connection con;
	
	
	/**
	 * this method will establish the connection with the my sql database
	 * @throws SQLException
	 */
	public void connectToDataBase() throws SQLException {
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection(Iconstants.dbURL,Iconstants.dbUserName,Iconstants.dbPassword);	
	}
	
	/**
	 * this method will close DB connection
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException {
		con.close();
		
	}
	
	/**
	 * thise method will execute the query and return the value only if the validation is success
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String readDataFromDBAndValidate(String query,int columnIndex,String expData) throws SQLException {
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next()) {
			if(result.getString(columnIndex).equalsIgnoreCase(expData)) {
				flag =true;
				break;
			}	
		}
		if(flag) {
			System.out.println("data verified");
			return expData;
			
		}
		else {
			System.out.println("data not verified");
			return "";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
