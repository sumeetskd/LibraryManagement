package loginStaff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnect.DBConnect;

public class StaffModelDAO {
	public StaffModel getUserDetails(String username) {
		StaffModel sf = new StaffModel();
		
		try {
			
			Connection con = DBConnect.connectDB();
			
			PreparedStatement st = con.prepareStatement("select * from staff where username = ?");
			st.setString(1, username);
			ResultSet rs = st.executeQuery();	//executes the DDL statement
			
			if(rs.next()) {					//rs.next() will return true if any record exists in next row
				
//				System.out.println(rs.getString("username"));
				sf.setEid(rs.getInt("eid"));
				sf.setName(rs.getString("name"));
				sf.setUsername(rs.getString("username"));
				sf.setDate(rs.getString("date"));
				sf.setDepartment(rs.getString("department"));
				sf.setDesigination(rs.getString("desigination"));
	
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return sf;
	}
	public boolean present(String uname, String pass) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConnect.connectDB();
		
		String query = "select username,password from staff where username=? and password=?";
		PreparedStatement s = con.prepareStatement(query);
		s.setString(1, uname);
		s.setString(2, pass);
		ResultSet rs = s.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}
	public boolean insert(StaffModel sm){
		int status = 0;
		try {
			Connection con = DBConnect.connectDB();
			
			PreparedStatement st = con.prepareStatement("insert into staff values(?,?,?,?,?,?,?)");
			st.setInt(1, sm.getEid());
			st.setString(2, sm.getName());
			st.setString(3, sm.getUsername());
			st.setString(4, sm.getDate());
			st.setString(5, sm.getDepartment());
			st.setString(6, sm.getDesigination());
			st.setString(7, sm.getPassword());
			
			status = st.executeUpdate();	//return 1 for successful execution
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(status==1) {
			return true;
		}

		return false;
	}
	public boolean checkUsername(String user) {
		
		try {
			
			Connection con = DBConnect.connectDB();
			
			PreparedStatement st = con.prepareStatement("select username from staff");
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {					//rs.next() will return true if any record exists in next row
				System.out.println(rs.getString("username"));
				String s = rs.getString("username");
				if(user.equals(s))
					return true;	//returns true if username already present
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}
	
}
