<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
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
<form action="signup" method="post">
<fieldset>
<legend>Signup</legend>
<br><br>
<label for="N">Enter Your Name</label><br>
<input type="text" id="N" name="name" placeholder="Enter your name" required="required"><br><br>
<label for="e">Enter Your Email</label><br>
<input type="email" id="e" name="email" placeholder="Enter your email" required="required"><br><br>
<label for="p">Create a password</label><br>
<input type="password" id="p" name="password" placeholder="Create a password"  required="required"><br><br>
<input type="submit"  value="Signup">

</fieldset>
</form>
</body>
</html>