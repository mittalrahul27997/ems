/*
 * UpdateProject
 * 
 * 1.0
 *
 * 18/01/2019
 * 
 * Copyright notice
 */
package com.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDaoImp;
import com.pojo.Project;

public class UpdateProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request,
	 *  HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException {
		String id=request.getParameter("pid");
		String des=request.getParameter("pdesc");
		Project project=new Project();
	    project.setId(id);
	    project.setDes(des);
	     
	    ProjectDaoImp pi=new ProjectDaoImp();
	    pi.updateProject(project);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, 
	 * HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
