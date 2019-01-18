package com.dao;

import java.sql.ResultSet;

import com.pojo.Project;

public interface ProjectDao {
	
	boolean addProject(Project project);
	boolean updateProject(Project project);
	ResultSet retrieveToUpdate(String project_id);
	boolean deleteProject(String project_id);
	boolean backup();
}
