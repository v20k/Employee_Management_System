<%@page import="e_m_s.dto.Company"%>
<% Company login=(Company)session.getAttribute("login");
if(login!=null){
%>


<%@page import="e_m_s.dto.Employee"%>
<%@page import="e_m_s.dao.Employee_DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	flex-direction:column;
	align-items: center;
    height:550px;
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

<% String eid=request.getParameter("Eid");
   int id=Integer.parseInt(eid);
   Employee emp=new Employee_DAO().findEmployee(id);
   
%>



<form  action="update" method="post">
<fieldset>
<legend>UpdateEmployee</legend>
<br><br>

<label>Employee Id</label><br>
<input type="text"  name="id" value="<%=emp.getE_id() %>" readonly><br><br>

<label for="N">Update Employee Name</label><br>
<input type="text" id="N" name="name" value="<%= emp.getE_name() %>"><br><br>

<label for="A">Update Employee Age</label><br>
<input type="number" id="A" name="age" value="<%= emp.getE_age()  %>"><br><br>

<label for="G">Update Employee Gender</label><br>
<input type="radio" id="G" name="gender" value="Male"
<%if("Male".equals(emp.getGen())){
	%>
	checked
	<%} %>
>Male
<input type="radio" name="gender" value="Female"
<%if("Female".equals(emp.getGen())){
	%>
	checked
	<%} %>
	>Female
<input type="radio" name="gender" value="Other"
<%if("Other".equals(emp.getGen())){
	%>
	checked
	<%} %>
>Other
<br><br>

<label for="R">Update Employee Role</label><br>
<select  name="role" >
<option id="R"
<%if("Manager".equals(emp.getRole())){
	%>
      selected
	<%} %>

>Manager</option>
<option
<%if("Executive".equals(emp.getRole())){
	%>
      selected
	<%} %>

>Executive</option>
<option 
<%if("HR".equals(emp.getRole())){
	%>
      selected
	<%} %>
>HR</option>
<option
<%if("Worker".equals(emp.getRole())){
	%>
      selected
	<%} %>

>Worker</option>
</select>
<br><br>


<label for="L">Update Employee Location</label><br>
<select  name="E_bus_charges" >
<option id="L"
<%if(3000.0==emp.getE_bus_charges()){
	%>
      selected
	<%} %>

>Chennai</option>
<option
<%if(5000.0==emp.getE_bus_charges()){
	%>
      selected
	<%} %>
>Kanchipuram</option>
<option
<%if(6000.0==emp.getE_bus_charges()){
	%>
      selected
	<%} %>

>Thiruvallur</option>
</select>
<br><br>
<input type="submit" value="save">

</fieldset>
</form>


</body>
</html>

<% }else{
response.sendRedirect("CompanyLogin.jsp");
}%>