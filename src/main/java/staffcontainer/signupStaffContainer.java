package staffcontainer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnect.DBConnect;
import loginStaff.StaffModel;
import loginStaff.StaffModelDAO;

/**
 * Servlet implementation class signupStaffContainer
 */
@WebServlet("/signupStaffContainer")
public class signupStaffContainer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		try {
			boolean insertStatus = false;
			String name = request.getParameter("name");
			String username = request.getParameter("username");
			int eid = Integer.parseInt(request.getParameter("eid"));
			String dob = request.getParameter("dob");
			String department = request.getParameter("department");
			String designation = request.getParameter("branch");
			String password = request.getParameter("pwd");
			
			StaffModel sm = new StaffModel(eid,name, username, dob, department, designation, password);

			StaffModelDAO staffDB = new StaffModelDAO();
			
			if(staffDB.checkUsername(username) == false) {
				System.out.println("Username not taken");
				if(staffDB.insert(sm)) {
					insertStatus = true;
					System.out.println("Successfully Inserted");
					
					response.sendRedirect("login-staff.jsp");
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
