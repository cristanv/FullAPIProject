package POJOforserializationAndDeserialization;

import org.codehaus.jackson.map.ObjectMapper;
import org.omg.CORBA.Object;

public class EmployeeDetailwithSpouse {
	
	String eName;
	int eId;
	int[] phno;
	String[] mail;
	String address;
	//Object EmployeeDetailspousedetail;
	EmployeeDetailspousedetail s;
	
	
	public EmployeeDetailwithSpouse() {
		
	}


	public EmployeeDetailwithSpouse(String eName, int eId, int[] phno, String[] mail, String address,
			EmployeeDetailspousedetail s) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.phno = phno;
		this.mail = mail;
		this.address = address;
		this.s = s;
	}


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


	public int[] getPhno() {
		return phno;
	}


	public void setPhno(int[] phno) {
		this.phno = phno;
	}


	public String[] getMail() {
		return mail;
	}


	public void setMail(String[] mail) {
		this.mail = mail;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public EmployeeDetailspousedetail getS() {
		return s;
	}


	public void setS(EmployeeDetailspousedetail s) {
		this.s = s;
	}
	
	


	
	
	
	

}
