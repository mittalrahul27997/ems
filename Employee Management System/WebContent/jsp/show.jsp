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

	<%
		ResultSet resultset=(ResultSet)request.getAttribute("rs");
	while(resultset.next()) {
	%>
	<form>
	<center>
	<table border="2">
		<tr>
			<th>Id</th>
			<td><%=resultset.getString("id") %></td>
		</tr>
		<tr>
			<th>Name</th>
			<td><%=resultset.getString("name") %></td>
		</tr>
		<tr>
			<th>Contact</th>
			<td><%=resultset.getString("contact") %></td>
		</tr>
	</table>
	</center>
	</form>
<%
}%>
</body>
</html>