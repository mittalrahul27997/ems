package com.dao;

import java.sql.ResultSet;

import com.pojo.Employee;

public interface EmployeeDao {
	
	boolean create(Employee employee);
	ResultSet retrieve(String empid);
	boolean update(Employee employee);
	boolean deleteEmployee(String empid);
	ResultSet retrieveUpdate(String empid);
	Employee sortEmployeeBySalary();
	Employee getEmployeesByProjectId(String project_id);

}
