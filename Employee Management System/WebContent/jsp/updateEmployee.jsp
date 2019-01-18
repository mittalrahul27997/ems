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
	
	<form action="UpdateEmployee" method="get">
	<center>
		<table>
			<tr>
				<th>Employee Id</th>
				<td><input type="hidden" name="eid" id="eid"value="<%=resultset.getString("id") %>"></td>
			</tr>
			<tr>
				<th>Employee Name</th>
				<td><input type="text" name="ename" id="ename" value="<%=resultset.getString("name") %>"></td>
			</tr>
			<tr>
				<th>Contact</th>
				<td><input type="text" name="econtact" id="econtact" value="<%=resultset.getString("contact") %>"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="update" value="Update"></td>
			</tr>
		</table>
		</center>
	</form>

	<%
	}%>

</body>
</html>