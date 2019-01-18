/*
 * Backup
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

import com.dao.EmployeeDaoImp;
import com.dao.EmployeeProjectDaoImp;
import com.dao.ProjectDaoImp;
import com.dao.SalaryDaoImp;

/**
 * Servlet implementation class Backup
 */
@WebServlet("/Backup")
public class Backup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Backup() {
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
		
		EmployeeDaoImp em=new EmployeeDaoImp();
		ProjectDaoImp pi=new ProjectDaoImp();
		SalaryDaoImp si=new SalaryDaoImp();
		EmployeeProjectDaoImp ep=new EmployeeProjectDaoImp();
		em.backup();
		pi.backup();
		si.backup();
		ep.backup();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, 
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
