/*
 * AssignProject
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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeProjectDaoImp;
import com.pojo.EmployeeProject;

/**
 * Servlet implementation class AssignProject
 */
@WebServlet("/AssignProject")
public class AssignProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, 
	 * HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, 
			IOException {
		// TODO Auto-generated method stub
		
		String e_id=request.getParameter("eid");
		String p_id=request.getParameter("pid");
		EmployeeProject ep=new EmployeeProject();
		ep.setEmp_id(e_id);
		ep.setProject_id(p_id);
		EmployeeProjectDaoImp epd=new EmployeeProjectDaoImp();
		epd.assignProject(ep);
		
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
