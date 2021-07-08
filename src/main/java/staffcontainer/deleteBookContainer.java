package staffcontainer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import book.BookDAO;

/**
 * Servlet implementation class deleteBookContainer
 */
@WebServlet("/StaffHome/delete")
public class deleteBookContainer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("bookid"));
		
		BookDAO bookdb = new BookDAO();
		HttpSession session = request.getSession();
		if(bookdb.delete(id)) {
			String k = "Successfully Deleted";
			System.out.println("Successfully Deleted");
			session.setAttribute("msg", k);
			response.sendRedirect("deleteBookRecord.jsp");
		}
	
	}

}
