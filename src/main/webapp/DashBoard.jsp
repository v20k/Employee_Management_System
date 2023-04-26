

<%@page import="e_m_s.dto.Company"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DashBoard</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	flex-direction:column;
	align-items: center;
    height:600px;
}

a {
	text-decoration: none;
	padding: 5px 10px;
	border: 2px solid red;
	border-radius: 10px; 
	
}
</style>
</head>
<body>
<% Company logincreditentials=(Company) session.getAttribute("login");
if(logincreditentials!=null){
%>

<h1>WELCOME ADMIN</h1>
<h5>choose your option</h5>
<div><a href="SaveEmployee.jsp">SAVE</a> <a href="ViewEmployee.jsp">VIEW</a></div>

<br><br>
<a href="Logout">Logout</a>


</body>
</html>



<% }else{
response.sendRedirect("CompanyLogin.jsp");
}%>