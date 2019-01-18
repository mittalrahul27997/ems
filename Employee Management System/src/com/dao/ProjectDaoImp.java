/*
 * ProjectDaoImp
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

import com.controller.DBConnection;
import com.pojo.Project;

public class ProjectDaoImp implements ProjectDao {
	
	Connection con=null;

	@Override
	public boolean addProject(Project project) {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		try{
			  PreparedStatement ps=con.prepareStatement(
					  "insert into project values(?,?)");
			  ps.setString(1, project.getId());
			  ps.setString(2, project.getDes());

			  ps.execute();
			} catch(SQLException e){
				System.out.println(e);
			}
		
		return false;
	}

	@Override
	public boolean updateProject(Project project) {
		// TODO Auto-generated method stub
		
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement(
					"update project set des=? where id="+project.getId());
			ps.setString(1, project.getDes());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public ResultSet retrieveToUpdate(String id) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement(
					"select * from project where id="+id);
			rs=ps.executeQuery();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return rs;
	}

	@Override
	public boolean deleteProject(String project_id) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement(
					"delete from project where id="+project_id);
			ps.executeUpdate();
			
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
