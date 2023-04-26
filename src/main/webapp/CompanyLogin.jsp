<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
    height:600px;
	
	
}
form{
height: 200px;
width: 300px;

}
legend{
 text-decoration: underline;
}
fieldset {
background-color: aqua;
	box-shadow: 7px 7px 1px;
}



</style>
</head>
<body>
<form action="login" method="post">
<fieldset>
<legend>Login</legend>
<br><br>
<label for="e">Login Email</label><br>
<input type="email" id="e" name="email" placeholder="Enter Your Email" required="required"><br><br>
<label for="p">Login Password</label><br>
<input type="password" id="p" name="password" placeholder="Enter your password" required="required"><br><br>
<input type="submit" value="Login">
</fieldset>
</form>

</body>
</html>