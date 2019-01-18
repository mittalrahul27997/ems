/*
 * SalaryDaoImp
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.controller.DBConnection;
import com.pojo.Salary;

public class SalaryDaoImp implements SalaryDao {

	@Override
	public boolean addSalary(Salary salary) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement(
					"insert into salary values(?,?)");
			ps.setString(1, salary.getEmp_id());
			ps.setString(2, salary.getEmp_salary());
			ps.execute();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	@Override
	public ResultSet retrieveToUpdateSalary(String empid) {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		ResultSet rs=null;
		try {
			
			PreparedStatement ps=con.prepareStatement(
					"select * from salary where emp_id="+empid);
			ps.executeQuery();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return rs;
	}
	


	@Override
	public boolean updateSalary(Salary salary) {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		try {
			
			PreparedStatement ps=con.prepareStatement(
					"update salary set salary=? where emp_id="
					+salary.getEmp_id());
			ps.setString(1, salary.getEmp_salary());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public ResultSet sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		ResultSet rs=null;
		try {
			
		Statement s=con.createStatement();
		
		String sql="select id, name, contact, salary from employee,"
				+ "salary where id=emp_id order by salary asc";
		rs=(ResultSet)s.executeQuery(sql);
		
		} catch(SQLException e) {
			System.out.println(e);
		}
		
		return rs;
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
