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
import loginStaff.StaffModelDAO;

@WebServlet("/StaffHome/ModifyBookRecord")
public class UpdateBookRecordController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		
		BookDAO bookdb = new BookDAO();
		
		if(bookdb.findBookPresence(bookid)) {
			BookModel book = bookdb.findBook(bookid);
			System.out.println(book);
			
			session.setAttribute("dataBook", book);
			response.sendRedirect("ModifyBookRecord.jsp");
		}else {
			System.out.println("Book Not Found");
		}
		
		
		
	}

}
