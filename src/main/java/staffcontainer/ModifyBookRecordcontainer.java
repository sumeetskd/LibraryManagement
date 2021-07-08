package staffcontainer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import book.BookDAO;
import book.BookModel;

/**
 * Servlet implementation class ModifyBookRecordcontainer
 */
@WebServlet("/StaffHome/ModifyBookRecordcontainer")
public class ModifyBookRecordcontainer extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int bookid = (int)session.getAttribute("bookid");
		int empid = (int)session.getAttribute("empid");
		
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String publication = request.getParameter("publication");
		int copies = Integer.parseInt(request.getParameter("copies"));
		String date = request.getParameter("date");
		
		BookDAO bookdb = new BookDAO();
		
		BookModel bm = new BookModel(bookid, name, author, publication, copies, date, empid);
		
		if(bookdb.update(bm)) {
			
			System.out.println("Successfully Inserted");
			String s = "inserted";
			session.setAttribute("msg",s);
			response.sendRedirect("/Library_Management/staffDashboard.jsp");
		}
		
		
	}

}
