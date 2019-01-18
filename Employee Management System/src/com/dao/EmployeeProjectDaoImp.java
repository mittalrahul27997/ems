/*
 * EmployeeProjectDaoImp
 * 
 * 1.0
 *
 * 18/01/2019
 * 
 * Copyright notice
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.controller.DBConnection;
import com.pojo.EmployeeProject;

public class EmployeeProjectDaoImp implements EmployeeProjectDao {

	@Override
	public boolean assignProject(EmployeeProject ep) {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		try {
			
			PreparedStatement ps=con.prepareStatement(
					"insert into employee_project values(?,?)");
			ps.setString(1, ep.getEmp_id());
			ps.setString(2, ep.getProject_id());
			ps.execute();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public boolean backup() {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		try {
			
			PreparedStatement ps1=con.prepareStatement("");
			ps1.execute();
		} catch(SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	

}
