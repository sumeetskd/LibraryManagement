<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Student</title>
    <link rel="stylesheet" href="css/style-Student.css">
</head>
<body>
    <div class="container">
        <div class="header container-items">
            <h1>
                Create a new student membership
            </h1>
        </div>
        <div class="body container-items">
            <form action="login-student.jsp">
                <div class="form-items">
                    <label for="name">Name</label>
                    <input type="text" name="name">
                </div>
                <div class="form-items">
                    <label for="reg">Registration ID</label>
                    <input type="number" name="regid">
                </div>
                <div class="form-items">
                    <label for="name">Date of Birth</label>
                    <input type="date" name="dob">
                </div>
                <div class="form-items">
                    <label for="sec">Section</label>
                    <input type="text" name="section">
                </div>
                <div class="form-items">
                    <label for="bran">Branch</label>
                    <input type="text" name="branch">
                </div>
                <div class="form-items">
                    <label for="pass">Password</label>
                    <input type="password" name="pwd">
                </div>
                <div class="form-items">
                    <label for="con-pass">Confirm Password</label>
                    <input type="password" name="cnf-pwd">
                </div>
                <div class="form-items">
                    <!-- <label for="sub">Hi</label> -->
                    <input type="submit" id="btn" name="sub" value="Register">
                </div>
            </form>

        </div>
    </div>
</body>
</html>