package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.controller.DBConnection;
import com.pojo.Employee;

public class EmployeeDaoImp implements EmployeeDao {
	
	Connection con=null;
	
	public void EmployeeDaoImpl(Connection con){
		this.con=con;
	}

	@Override
	public boolean create(Employee employee) {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		try{
		  PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		  ps.setString(1, employee.getId());
		  ps.setString(2, employee.getName());
		  ps.setString(3, employee.getContact());

		  ps.execute();
		} catch(SQLException e){
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public ResultSet retrieve(String empid) {
		
		Connection con=DBConnection.getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from employee where id="+empid);
			rs=ps.executeQuery();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return rs;
	}

	@Override
	public boolean update(Employee employee) {
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("update employee set name=?, contact=? where id="+employee.getId());
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getContact());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return false;
	}
	
	@Override
	public ResultSet retrieveUpdate(String empid) {
		Connection con=DBConnection.getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from employee where id="+empid);
			
			rs=ps.executeQuery();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return rs;
	}


	@Override
	public boolean deleteEmployee(String empid) {
		
		Connection con=DBConnection.getConnection();
		try{
		  PreparedStatement s=con.prepareStatement("delete from employee where id="+empid);

		  s.executeUpdate();
		} catch(SQLException e){
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public Employee sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeesByProjectId(String project_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
