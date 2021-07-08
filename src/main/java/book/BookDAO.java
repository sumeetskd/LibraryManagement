package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbconnect.DBConnect;

public class BookDAO {
	
	public List<BookModel> getBookDetails(int eid) {
		
		List<BookModel> bookList = new ArrayList<>();
		try {
			Connection con = DBConnect.connectDB();
			
			PreparedStatement ps = con.prepareStatement("select * from book where emp_id=?");
			ps.setInt(1, eid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BookModel book = new BookModel();
				book.setBookid(rs.getInt("bookid"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPublication(rs.getString("publication"));
				book.setCopies(rs.getInt("copies"));
				book.setDate(rs.getString("date"));
				book.setEmp_id(rs.getInt("emp_id"));
				
				bookList.add(book);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return bookList;
	}
	public boolean insert(BookModel bm) {
		try {
			Connection con = DBConnect.connectDB();
			PreparedStatement ps = con.prepareStatement("insert into book values(?,?,?,?,?,?,?)");
			ps.setInt(1, bm.getBookid());
			ps.setString(2, bm.getName());
			ps.setString(3,bm.getAuthor());
			ps.setString(4,bm.getPublication());
			ps.setInt(5, bm.getCopies());
			ps.setString(6,bm.getDate());
			ps.setInt(7, bm.getEmp_id());
			
			if(ps.executeUpdate()==1) {
				return true;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
		
	}
	public boolean delete(int id) {
		
		try {
			Connection con = DBConnect.connectDB();
			
			PreparedStatement ps = con.prepareStatement("delete from book where bookid=?");
			ps.setInt(1, id);
			
			//.executeUpdate()=1, for DML statement
			if(ps.executeUpdate()==1) {	
				return true;
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return false;
	}
	public BookModel findBook(int bookid) {
		BookModel a = new BookModel();
		try {
			Connection con = DBConnect.connectDB();
			
			PreparedStatement ps = con.prepareStatement("select * from book where bookid=?");
			ps.setInt(1, bookid);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				a.setBookid(rs.getInt("bookid"));
				a.setName(rs.getString("name"));
				a.setAuthor(rs.getString("author"));
				a.setPublication(rs.getString("publication"));
				a.setCopies(rs.getInt("copies"));
				a.setDate(rs.getString("date"));
				a.setEmp_id(rs.getInt("emp_id"));
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return a;
	}
	public boolean findBookPresence(int bookid) {
		
		try {
			Connection con = DBConnect.connectDB();
			
			PreparedStatement ps = con.prepareStatement("select * from book where bookid=?");
			ps.setInt(1, bookid);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public boolean update(BookModel book) {
		
		try {
			Connection con = DBConnect.connectDB();
			PreparedStatement ps = con.prepareStatement("update book set name=?,author=?, publication=?, copies=?, date=? where bookid = ?");
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getPublication());
			ps.setInt(4, book.getCopies());
			ps.setString(5, book.getDate());
			ps.setInt(6, book.getBookid());
			
			int rs = ps.executeUpdate();
			if(rs==1) {
				return true;
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}
}