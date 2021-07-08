package staffcontainer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbconnect.DBConnect;
import loginStaff.StaffModel;
import loginStaff.StaffModelDAO;


@WebServlet("/LoginStaffContainer")
public class LoginStaffContainer extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = (String)request.getParameter("uname");
		String password = (String)request.getParameter("pass");
//		System.out.println(uname+" "+password);
		PrintWriter out = response.getWriter();
		StaffModelDAO sf = new StaffModelDAO();
		HttpSession session = request.getSession();
		
		try {
			if(sf.present(uname, password)) {
				StaffModel staffObject = sf.getUserDetails(uname);
				System.out.println("Found");
				System.out.println(staffObject);
				session.setAttribute("details", staffObject);
				
				response.sendRedirect("staffDashboard.jsp");
			}else {
				System.out.println("Incorrect Username or password");
				out.print("Invalid Username or password, <a href='login-staff.jsp'>Click Here</a>, to return to the previous page. ");
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}


}
