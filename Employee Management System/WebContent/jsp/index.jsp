<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<div class="jumbotron">
				<center><h1>EMPLOYEE MANAGEMENT SYSTEM</h1></center>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-5"></div>
		<div class="col-sm-4">
			<a href="jsp/insertEmployee.jsp">					Create Employee</a><br/>
			<a href="jsp/emp_retrieve_by_id.jsp">				Retrieve Employee By Id</a><br/>
			<a href="jsp/emp_retrieve_to_update.jsp">			Update Employee</a><br/>
			<a href="jsp/deleteEmployee.jsp">					Delete Employee</a><br/>
			<a href="jsp/addProject.jsp">						Add Project</a><br/>
			<a href="jsp/project_retrieve_to_update.jsp">		Update Project</a><br/>
			<a href="jsp/deleteProject.jsp">					Delete Project</a><br/>
			<a href="jsp/addEmployeeSalary.jsp">				Add Salary</a><br/>
			<a href="jsp/terrieve_to_update_salary.jsp">		Update Salary</a><br/>
			<a href="jsp/assignProject.jsp">					Assign Project</a><br/>
			<a href="jsp/sortEmployeeBySalary.jsp">				Sort Employee By Salary</a><br/>
			<a href="jsp/createBackup.jsp">						Create Backup</a><br/>
		</div>
	</div>

</body>
</html>