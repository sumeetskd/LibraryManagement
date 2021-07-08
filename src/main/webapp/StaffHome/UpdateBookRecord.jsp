<%@page import="book.BookModel"%>
<%@page import="java.util.List"%>
<%@page import="book.BookDAO"%>
<%@page import="loginStaff.StaffModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Book Record</title>
    <link rel="stylesheet" href="../css/style-newRecord.css">

<!-- Here it will show the user to select the books registered by him from the table(fetching the data from db),
the data from this table will be transferred to another page to modify the data.
 -->
</head>
<body>
	<%
		session = request.getSession();		
		StaffModel staff = (StaffModel)session.getAttribute("details");
		
		int eid = staff.getEid();
		BookDAO bookdb = new BookDAO();
		
		List<BookModel> bookList = bookdb.getBookDetails(eid);
		
		
	%>
    <div class="container">
        <div class="logout">
            <a href="login-staff.jsp">LOGOUT</a>
        </div>
        <div class="sec">
            <div class="sec-head">
                <h2>Update Book Record</h2>
            </div>
            <div class="sec-form">
                <form action="ModifyBookRecord" method="post" style="width:420px;">
                
                	<div class="form-items" style="padding-bottom: 80px;">
                    	<span id="data-list" style="display:flex; flex-wrap: wrap; border: 1px solid black;">
                    		<div class="span-items span-head" style="flex-basis:100%; display: flex; border-bottom: 1px solid black;">
                    			<label style="justify-content: center;">Book ID</label>
                    			<label style="justify-content: center;">Name</label>
                    			<label style="justify-content: center;">Copies</label>
                    		</div>
                    		
                    		<%
                    			for(BookModel a: bookList){
                    		%>
                    		<div class="span-items" style="flex-basis:100%; display: flex; border-bottom: 1px solid black;">
                    		
                    			<label style="justify-content: center;">
                    			<% 		out.print(a.getBookid()); %>
                    			</label>
                    			<label style="justify-content: center;">
                    			<% 		out.print(a.getName()); %>
                    			</label>
                    			<label style="justify-content: center;">
                    			<% 		out.print(a.getCopies()); %>
                    			</label>
                    					
                    		
                    		</div>		
                    		<%
                    			}
                    		%>
                    	</span>   
                        
                      
                    </div>
                    <div class="form-items" style="padding-bottom: 80px;">
                        <label for="bookid" style="justify-content: flex-start;"><span >Book ID</span></label>
                        <input type="text" placeholder="Enter bookid" name="bookid" id="bookid" style="
                        flex: 3;" required>
                    </div>
                   
                    <div class="form-items btn-contain">
                        <label for="" id=btn-label><span></span></label>
                        <!-- <label for=""><span>Date</span></label> -->
                        <div class="btn">
                            <input type="submit" id="submit" name="submit" value="Submit">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
