<%@page import="book.BookModel"%>
<%@page import="loginStaff.StaffModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modify Book Records</title>
    <link rel="stylesheet" href="../css/style-newRecord.css">

</head>
<body>
	<%
		session = request.getSession(); //here we can use the existing session object to accept the values
		StaffModel staff = (StaffModel) session.getAttribute("details");
		session.setAttribute("eid", staff.getEid());
		
		
		HttpSession session1 = request.getSession();
		BookModel bm = (BookModel)session1.getAttribute("dataBook");
		
		session1.setAttribute("bookid", bm.getBookid());
		session1.setAttribute("empid",bm.getEmp_id());
		
		
		out.print(bm.getBookid());
	%>
	
	
    <div class="container">
        <div class="logout">
            <a href="login.html">LOGOUT</a>
        </div>
        <div class="sec">
            <div class="sec-head">
                <h2>Modify Book Records</h2>
            </div>
            <div class="sec-form">
                <form action="ModifyBookRecordcontainer" method="post">
                	<div class="form-items">
                        <label for="name"><span>Name</span></label>
                        <input type="text" name="name" id="name" value="<% bm.getName();%>" required>
                    </div>
                    <div class="form-items">
                        <label for="author"><span>Author</span></label>
                        <input type="text" name="author" id="author" value="<% bm.getAuthor();%>" required>
                    </div>
                    <div class="form-items">
                        <label for="publisher"><span>Publication</span></label>
                        <input type="text" name="publication" id="publication" value="<% bm.getPublication();%>" required>
                    </div>
                    <div class="form-items">
                        <label for="copy"><span>Number of Copies</span></label>
                        <input type="number" name="copies" id="copies" value="<% bm.getCopies();%>" required>
                    </div>
                    <div class="form-items">
                        <label for="date"><span>Date</span></label>
                        <input type="date" id="date" name="date" value="<% bm.getDate();%>" required>
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