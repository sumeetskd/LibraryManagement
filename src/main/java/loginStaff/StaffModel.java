package loginStaff;

public class StaffModel {
	int eid;
	String name;
	String username;
	String date;
	String department;
	String desigination;
	String password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StaffDAO [eid=" + eid + ", name=" + name + ", username=" + username + ", date=" + date + ", department="
				+ department + ", desigination=" + desigination + ", password=" + password + "]";
	}
	
	public StaffModel(int eid, String name, String username, String date, String department, String desigination,
			String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.username = username;
		this.date = date;
		this.department = department;
		this.desigination = desigination;
		this.password = password;
	}
	public StaffModel() {
		// TODO Auto-generated constructor stub
	}

	
}
