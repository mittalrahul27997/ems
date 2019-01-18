/*
 * RetrieveToUpdateEmployee
 * 
 * 1.0
 *
 * 18/01/2019
 * 
 * Copyright notice
 */
package com.services;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDaoImp;

public class RetrieveToUpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveToUpdateEmployee() {
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
		
		String id=request.getParameter("eid"); 
		EmployeeDaoImp e=new EmployeeDaoImp();
		ResultSet r=(ResultSet) e.retrieveUpdate(id);
		request.setAttribute("rs", r);
		request.getRequestDispatcher(
				"jsp/updateEmployee.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *  HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, 
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
