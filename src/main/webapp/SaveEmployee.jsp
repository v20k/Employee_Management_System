<%@page import="e_m_s.dto.Company"%>
<% Company login=(Company)session.getAttribute("login");
if(login!=null){
%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Employee</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	flex-direction:column;
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
<form action="save" method="post">
<fieldset>
<legend>SaveEmployee</legend>
<label for="N">Enter Employee Name</label><br>
<input type="text" id="N" name="name" placeholder="name" required="required"><br><br>
<label for="A">Enter Employee Age</label><br>
<input type="number" id="A" name="age" placeholder="age"required="required"><br><br>
<label for="G">Enter Employee Gender</label><br>
<input type="radio" id="G" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Other">Other

<br><br>
<label for="R">Enter Employee Role</label><br>
<select  name="role">
<option id="R">Manager</option>
<option>Executive</option>
<option>HR</option>
<option>Worker</option>
</select>
<br><br>
<label for="L">Enter Employee Location</label><br>
<select  name="E_bus_charges">
<option id="L">Chennai</option>
<option>Kanchipuram</option>
<option>Thiruvallur</option>
</select>
<br><br>

<input type="submit" value="save">

</fieldset>
</form>



<!-- <script type="text/javascript">
var a= document.getElementById("domm");
a.value=document.getElementById("dom").value;
</script> -->
</body>
</html>


<% }else{
response.sendRedirect("CompanyLogin.jsp");
}%>