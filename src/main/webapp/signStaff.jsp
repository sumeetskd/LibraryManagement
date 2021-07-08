<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Staff</title>
    <link rel="stylesheet" href="css/style-staff.css">
</head>
<body>
    <div class="container">
        <div class="header container-items">
            <h1>
                Create a new staff membership
            </h1>
        </div>
        <div class="body container-items">
            <form name = "form" action="signupStaffContainer" method="post">
                <div class="form-items">
                    <label for="name">Name</label>
                    <input type="text" name="name" required>
                </div>
                <div class="form-items">
                    <label for="uname">Username</label>
                    <input type="text" name="username" required>
                </div>
                <div class="form-items">
                    <label for="reg">Employee ID</label>
                    <input type="number" name="eid" required>
                </div>
                <div class="form-items">
                    <label for="name">Date of Birth</label>
                    <input type="date" name="dob" required>
                </div>
                <div class="form-items">
                    <label for="sec">Department</label>
                    <input type="text" name="department" required>
                </div>
                <div class="form-items">
                    <label for="bran">Designation</label>
                    <input type="text" name="branch" required>
                </div>
                <div class="form-items">
                    <label for="pass">Password</label>
                    <input type="password" name="pwd" required onkeyup="checkLength();"/>
                </div>
                <div class="form-items">
                    <label for="con-pass">Confirm Password</label>
                    <input id="cnf-password" type="password" name="cnf-pwd" required onkeyup="check();"/>
                </div>
                <div class="form-items">

                    <span id="cnf-pwd-msg"></span>

                </div>
                <div class="form-items">
                    <!-- <label for="sub">Hi</label> -->
                    <input type="submit" id="btn" name="sub" value="Register" disabled>
                </div>
            </form>

        </div>
    </div>
    
    <script>
    function check() {
        let a = document.getElementsByName("pwd")[0].value;
        let b = document.getElementsByName("cnf-pwd")[0].value;
        if(a!=b){
            document.getElementById("cnf-pwd-msg").innerHTML = "Your password didn't match";
            document.getElementById("cnf-pwd-msg").style.color="red";

            document.getElementById("btn").disabled = true;

        }else{
            document.getElementById("cnf-pwd-msg").innerHTML = "Password Matched";
            document.getElementById("cnf-pwd-msg").style.color="green";

            document.getElementById("btn").disabled = false;

            
        }
       
    }
    function checkLength() {
        let a = document.getElementsByName("pwd")[0].value;
        let b = document.getElementsByName("cnf-pwd")[0].value;
        if(a.length<6){
            document.getElementById("cnf-pwd-msg").innerHTML = "Your password should be atleast 6 characters long";
            document.getElementById("cnf-pwd-msg").style.color="red";

        }else{
            document.getElementById("cnf-pwd-msg").innerHTML = "";
        }
       
    }
    </script>
    
</body>
</html>