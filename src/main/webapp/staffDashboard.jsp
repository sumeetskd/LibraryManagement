<%@page import="loginStaff.StaffModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Staff Home</title>
    <link rel="stylesheet" href="css/style-staffdash.css">
</head>

<body>
	<%
		session = request.getSession();		//here we can use the existing session object to accept the values
		StaffModel staff = (StaffModel)session.getAttribute("details");
	
		HttpSession session1 = request.getSession();
		String msg = (String)session1.getAttribute("msg");
		
	%>
    <div class="container">
        <div class="logout">
            <a href="login-staff.jsp">LOGOUT</a>
        </div>
        <div class="sec">
            <div class="head">
                <h1>Welcome, <span id="name">
                <%
                	out.println(staff.getName()); 
                %>
                </span></h1>
            </div>
            <div class="subhead">
                <h3>Actions to perform</h3>
            </div>
            <div class="body">
                <a href="StaffHome/addNewBookRecord.jsp" class="box">
                    <div class="box-items">
                        <span>Add Record</span>
                    </div>
                    
                </a>
                <a href="StaffHome/deleteBookRecord.jsp" class="box">
                    <div class="box-items">
                        <span>Delete Record</span>

                    </div>
                </a>
                <a href="StaffHome/UpdateBookRecord.jsp" class="box">
                    <div class="box-items">
                        <span>Update Record</span>
                    </div>
                </a>
            </div>
        </div>
        
        <div class="form-items" style="justify-content: center;
    display: flex;">
			<span id="msg" style="color:green;">
				<%
					if(msg=="inserted"){
						out.print("Successfully Inserted");
					}
				%>
			</span>
		</div>

    </div>
</body>

</html>