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
 * Servlet implementation class BookContainer
 */
@WebServlet("/StaffHome/addBook")
public class AddBookContainer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String name = request.getParameter("name");
		String author  = request.getParameter("author");
		String publication = request.getParameter("publication");
		int copies = Integer.parseInt(request.getParameter("copies"));
		String date = request.getParameter("date");
		int eid = (int) session.getAttribute("eid");
		
		BookModel bm = new BookModel(bookid, name, author, publication, copies, date,eid);
		
		BookDAO bookdb = new BookDAO();
		if(bookdb.insert(bm)) {
			System.out.println(bm);
			System.out.println("Successfully Inserted");
			String k = "inserted";
			session.setAttribute("insert",k);
			response.sendRedirect("addNewBookRecord.jsp");
		}
		
	}

}
