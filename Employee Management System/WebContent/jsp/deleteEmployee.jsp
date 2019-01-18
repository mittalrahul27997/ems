<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS</title>
</head>
<body>

	<form action="../DeleteEmployee" method="get">
	<center>
	<table>
		<tr>
			<td>Employee Id</td>
			<td><input type="text" name="eid" id="eid"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" name="delete" value="Delete"></td>
		</tr>		

	</table>
	</center>
	</form>

</body>
</html>