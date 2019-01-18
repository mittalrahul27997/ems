<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS</title>
</head>
<body>

	<form>
	<center>
	<table border="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact</th>
			<th>Salary</th>
		</tr>

	<%
		ResultSet resultset=(ResultSet)request.getAttribute("rs");
	while(resultset.next()) {
	%>
	
		<tr>
			<td><%=resultset.getString("id") %></td>
		
			<td><%=resultset.getString("name") %></td>
		
			<td><%=resultset.getString("contact") %></td>
		
			<td><%=resultset.getString("salary") %></td>
		</tr>
	
	<%
	}%>
	</table>
	</center>
	</form>

</body>
</html>