<%@page import="loginStaff.StaffModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add a new Book</title>
<link rel="stylesheet" href="../css/style-newRecord.css">
</head>

<body>
	<%
	session = request.getSession(); //here we can use the existing session object to accept the values
	StaffModel staff = (StaffModel) session.getAttribute("details");

	session.setAttribute("eid", staff.getEid());
	HttpSession session1 = request.getSession();
	String msg = (String)session1.getAttribute("insert");
	
	%>
	<div class="container">
		<div class="logout">
			<a href="../login-staff.jsp">LOGOUT</a>
		</div>
		<div class="sec">
			<div class="sec-head">
				<h2>Add a new Book Record</h2>
			</div>
			<div class="sec-form">
				<form action="addBook" method="post">
					<div class="form-items">
						<label for="name"><span>Book ID</span></label> <input
							type="number" name="bookid" id="name">
					</div>
					<div class="form-items">
						<label for="name"><span>Name</span></label> <input type="text"
							name="name" id="name">
					</div>
					<div class="form-items">
						<label for="author"><span>Author</span></label> <input type="text"
							name="author" id="author">
					</div>
					<div class="form-items">
						<label for="publisher"><span>Publication</span></label> <input
							type="text" name="publication" id="publication">
					</div>
					<div class="form-items">
						<label for="copy"><span>Number of Copies</span></label> <input
							type="number" name="copies" id="copies">
					</div>
					<div class="form-items">
						<label for="date"><span>Date</span></label> <input type="date"
							id="date" name="date">
					</div>
					<div class="form-items">
						<span id="msg" style="color:green;">
							<%
								if(msg=="inserted"){
									out.print("Successfully Inserted");
								}
							%>
						</span>
					</div>
					<div class="form-items .btn-contain">
						<label style="display: none;"><span></span></label>
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