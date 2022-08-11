package POJOforserializationAndDeserialization;

public class EmployeeDetails {
	
	//step:1 Declaire al the details
	String eName;
	int eId;
	int phno;
	String address;
	
	//for a deserialization purpose 
	public EmployeeDetails() {
		
	}
	//step:2 use constructor to initialized
	public EmployeeDetails(String eName, int eId, int phno, String address) {
		this.eName = eName;
		this.eId = eId;
		this.phno = phno;
		this.address = address;
	}

	
	
	//step:3 use getter and setter to access
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
