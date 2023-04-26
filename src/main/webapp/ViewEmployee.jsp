<%@page import="e_m_s.dao.Company_DAO"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="e_m_s.dto.Company"%>
<% Company login=(Company)session.getAttribute("login");
if(login!=null){
%>


<%@page import="e_m_s.dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="e_m_s.dao.Employee_DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employee</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	flex-direction:column;
	align-items: center;
    height:600px;
}
</style>
</head>
<body>

<table border="" cellspacing=0 >
<tr>
<th>E_id</th>
<th>E_Name</th>
<th>E_Age</th>
<th>E_Gender</th>
<th>E_Role</th>
<th>E_Uniform_charges</th>
<th>E_Bus_Charges</th>
<th>Date of Creation</th>
<th>UPDATE</th>
<th>DELETE</th>
</tr>


<% 
System.out.println(" hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
/* List<Employee> employees=login.getEmployee(); */
Company_DAO dao=new Company_DAO();
List<Employee> employees=dao.findCompany(login.getC_id()).getEmployee();
%>
<%
for(Employee employee:employees){ %>
<tr>
<td><%=employee.getE_id() %></td>
<td><%= employee.getE_name()%></td>
<td><%= employee.getE_age()%></td>
<td><%= employee.getGender()%></td>
<td><%= employee.getRole()%></td>
<td><%= employee.getE_uniform_charges()%></td>
<td><%= employee.getE_bus_charges()%></td>
<td><%= employee.getDate()%></td>
<td><a href="UpdateEmployee.jsp?Eid=<%=employee.getE_id() %>">Update</a></td>
<td><a href="delete?EEid=<%= employee.getE_id() %>">Delete</a></td>
</tr>
<%} %>

</table>

<a href="DashBoard.jsp">close</a>


</body>
</html>

<% }else{
response.sendRedirect("CompanyLogin.jsp");
}%>