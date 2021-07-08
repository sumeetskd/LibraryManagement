package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect{
	public static Connection connectDB() throws ClassNotFoundException, SQLException {
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/";
		
		String dbName = "librarymanagement";
		String user = "root";
		String pwd = "root";
		
		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL+dbName,user,pwd);
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		return con;
		
	}
}
