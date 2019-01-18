package com.dao;

import com.pojo.EmployeeProject;

public interface EmployeeProjectDao {
	
	boolean assignProject(EmployeeProject ep);
	boolean backup();

}
