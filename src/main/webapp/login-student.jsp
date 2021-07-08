<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/style-login.css">
</head>

<body>
    <div>
        <div class="container">
            <div class="head">
                <h1>LOGIN</h1>
                <form action="studentDashboard.jsp">
                    <div class="form-items">
                        <label>Username</label>
                        <input type="text" id="uname">
                    </div>
                    <div class="form-items">
                        <label>Password</label>
                        <input type="password" id="password">
                    </div>
                    <div class="form-items">
                        <div class="submit-links">
                            <div class="links">
                                <a href="forgetpwd.html" id="forget">Forget Password</a>
                                <a href="signStud.jsp" id="signup">New Register/Sign-up</a>
                            </div>
                            <input id = "sub-button" type="submit" value="Login">
                        </div>
                    </div>
                </form>
            </div>

        </div>
    </div>
</body>

</html>