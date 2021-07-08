package book;

public class BookModel {
	int bookid;
	String name;
	String author;
	String publication;
	int copies;
	String date;
	int emp_id;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BookModel(int bookid, String name, String author, String publication, int copies, String date, int emp_id) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.copies = copies;
		this.date = date;
		this.emp_id = emp_id;
	}
	public BookModel() {
		super();
	}
	
	
	
}
