package com.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.pojo.Employee;
import com.pojo.Salary;

public interface SalaryDao {
	boolean addSalary(Salary salary);
	ResultSet retrieveToUpdateSalary(String empid);
	boolean updateSalary(Salary salary);
	ResultSet sortEmployeeBySalary();
	boolean backup();

}
