package POJOforserializationAndDeserialization;

import java.lang.reflect.Array;

public class EmployeeDetails_update {
	
	//step:1 Declaire al the details
		String eName;
		int eId;
		int[] phno;
		String[] mail;
		String address;
		
		public EmployeeDetails_update() {
			
		}

		public EmployeeDetails_update(String eName, int eId, int[] phno, String[] mail, String address) {
			super();
			this.eName = eName;
			this.eId = eId;
			this.phno = phno;
			this.mail = mail;
			this.address = address;
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

		
		

}
