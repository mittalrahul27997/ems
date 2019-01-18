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
	
	<form action="UpdateProject" method="get">
	<center>
		<table>
			<tr>
				<th></th>
				<td><input type="hidden" name="pid" id="pid" value="<%=resultset.getString("id")%>"></td>
			</tr>
			<tr>
				<th>Project Description</th>
				<td><input type="text" name="pdesc" id="pdesc" value="<%=resultset.getString("des")%>"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="pupdate" value="Update"></td>
			</tr>
		</table>
		</center>
	</form>

	<%
	}%>

</body>
</html>